Imports System.Data
Imports System.Data.OleDb
Public Class frmPizza
    Dim OrderNumber As Integer
    Dim PizzaConnection As OleDbConnection
    Dim CustomersCommand As OleDbCommand
    Dim CustomersAdapter As OleDbDataAdapter
    Dim CustomersTable As DataTable
    Dim CustomersManager As CurrencyManager
    Dim OrdersCommand As OleDbCommand
    Dim OrdersAdapter As OleDbDataAdapter
    Dim OrdersTable As DataTable
    Dim PizzasCommand As OleDbCommand
    Dim PizzasAdapter As OleDbDataAdapter
    Dim PizzasTable As DataTable
    Dim PizzaSize As Integer
    Dim TotalCost As Single, NumberPizzas As Integer
    Dim ToppingCost(11) As Single
    Dim SizeCost(2) As Single
    Dim DeliveryCost As Single
    Dim TaxRate As Single
    Const NumberToppings As Integer = 12
    Dim chkTop(11) As CheckBox
    Dim rdoSize(2) As RadioButton
    Private Sub frmPizza_Load(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles MyBase.Load
        'Topping cost information (veggies 50 cents, meats 1 dollar)
        chkTop(0) = chkCheese : ToppingCost(0) = 0.5
        chkTop(1) = chkMushrooms : ToppingCost(1) = 0.5
        chkTop(2) = chkBlackOlives : ToppingCost(2) = 0.5
        chkTop(3) = chkOnions : ToppingCost(3) = 0.5
        chkTop(4) = chkGreenPeppers : ToppingCost(4) = 0.5
        chkTop(5) = chkTomatoes : ToppingCost(5) = 0.5
        chkTop(6) = chkPepperoni : ToppingCost(6) = 1.0
        chkTop(7) = chkSalami : ToppingCost(7) = 1.0
        chkTop(8) = chkSausage : ToppingCost(8) = 1.0
        chkTop(9) = chkGroundBeef : ToppingCost(9) = 1.0
        chkTop(10) = chkShrimp : ToppingCost(10) = 1.0
        chkTop(11) = chkAnchovies : ToppingCost(11) = 1.0
        'Size cost
        rdoSize(0) = rdoSmall : SizeCost(0) = 4.0
        rdoSize(1) = rdoMedium : SizeCost(1) = 6.0
        rdoSize(2) = rdoLarge : SizeCost(2) = 8.0
        PizzaSize = 0
        'Delivery cost
        DeliveryCost = 1.5
        'Tax rate
        TaxRate = 8.9
        'get order number
        FileOpen(1, Application.StartupPath + "\..\..\pizza.ini", OpenMode.Input)
        Input(1, OrderNumber)
        FileClose(1)
        Me.Text = "Pizza Order #" + Format(OrderNumber, "0000")
        'connect to pizza database
        PizzaConnection = New OleDbConnection("Provider=Microsoft.Jet.OLEDB.4.0; Data Source = " + Application.StartupPath + "\..\..\PizzaDB.mdb")
        PizzaConnection.Open()
        'establish Customers command object
        CustomersCommand = New OleDbCommand("SELECT * FROM Customers ORDER BY PhoneNumber", PizzaConnection)
        'establish Customers data adapter/data table
        CustomersAdapter = New OleDbDataAdapter()
        CustomersAdapter.SelectCommand = CustomersCommand
        CustomersTable = New DataTable()
        CustomersAdapter.Fill(CustomersTable)
        'bind controls to data table
        txtFirstName.DataBindings.Add("Text", CustomersTable, "FirstName")
        txtLastName.DataBindings.Add("Text", CustomersTable, "LastName")
        txtAddress.DataBindings.Add("Text", CustomersTable, "Address")
        txtCity.DataBindings.Add("Text", CustomersTable, "City")
        txtState.DataBindings.Add("Text", CustomersTable, "State")
        txtZip.DataBindings.Add("Text", CustomersTable, "Zip")
        txtComment.DataBindings.Add("Text", CustomersTable, "Comment")
        'establish currency manager
        CustomersManager = DirectCast(Me.BindingContext(CustomersTable), CurrencyManager)
        'establish Orders command object
        OrdersCommand = New OleDbCommand("SELECT * FROM Orders ORDER BY PhoneNumber", PizzaConnection)
        'establish Orders data adapter/data table
        OrdersAdapter = New OleDbDataAdapter()
        OrdersAdapter.SelectCommand = OrdersCommand
        OrdersTable = New DataTable()
        OrdersAdapter.Fill(OrdersTable)
        'establish Pizzas command object
        PizzasCommand = New OleDbCommand("SELECT * FROM Pizzas ORDER BY OrderNumber", PizzaConnection)
        'establish Pizzas data adapter/data table
        PizzasAdapter = New OleDbDataAdapter()
        PizzasAdapter.SelectCommand = PizzasCommand
        PizzasTable = New DataTable()
        PizzasAdapter.Fill(PizzasTable)
        lblDate.Text = Format(Now, "d")
        txtPhone.Focus()
    End Sub

    Private Sub frmPizza_FormClosing(ByVal sender As System.Object, ByVal e As System.Windows.Forms.FormClosingEventArgs) Handles MyBase.FormClosing
        'save order number
        FileOpen(1, Application.StartupPath + "\..\..\pizza.ini", OpenMode.Output)
        PrintLine(1, OrderNumber)
        FileClose(1)
        Try
            'save the tables to the database file
            Dim OrdersAdapterCommands As New OleDbCommandBuilder(OrdersAdapter)
            OrdersAdapter.Update(OrdersTable)
            Dim CustomersAdapterCommands As New OleDbCommandBuilder(CustomersAdapter)
            CustomersAdapter.Update(CustomersTable)
            Dim PizzasAdapterCommands As New OleDbCommandBuilder(PizzasAdapter)
            PizzasAdapter.Update(PizzasTable)
        Catch ex As Exception
            MessageBox.Show("Error saving database", "Save Error", MessageBoxButtons.OK, MessageBoxIcon.Error)
            MessageBox.Show(ex.Message)
        End Try
        'close the connection
        PizzaConnection.Close()
        'dispose of the objects
        OrdersCommand.Dispose()
        OrdersAdapter.Dispose()
        OrdersTable.Dispose()
        CustomersCommand.Dispose()
        CustomersAdapter.Dispose()
        CustomersTable.Dispose()
        PizzasCommand.Dispose()
        PizzasAdapter.Dispose()
        PizzasTable.Dispose()
    End Sub

    Private Sub btnExit_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles btnExit.Click
        Me.Close()
    End Sub

    Private Sub PrintReceipt()
        'Declare the document
        Dim RecordDocument As Drawing.Printing.PrintDocument
        'Create the document and name it
        RecordDocument = New Drawing.Printing.PrintDocument()
        RecordDocument.DocumentName = "Pizza Invoice"
        'Add code handler
        AddHandler RecordDocument.PrintPage, AddressOf Me.PrintReceiptPage
        'Print document
        dlgPreview.Document = RecordDocument
        dlgPreview.ShowDialog()
        'Dispose of document when done printing
        RecordDocument.Dispose()
    End Sub
    Private Sub PrintReceiptPage(ByVal sender As Object, ByVal e As Drawing.Printing.PrintPageEventArgs)
        Dim I As Integer, J As Integer
        Dim S As String, Y As Integer
        'Print receipt
        Dim MyFont As Font = New Font("Arial", 12, FontStyle.Bold)
        Y = e.MarginBounds.Y
        e.Graphics.DrawString("Pizza Order Number " + Format(OrderNumber, "0000"), MyFont, Brushes.Black, e.MarginBounds.X, Y)
        Y += CInt(2 * MyFont.GetHeight(e.Graphics))
        MyFont = New Font("Arial", 12, FontStyle.Regular)
        e.Graphics.DrawString(txtFirstName.Text + " " + txtLastName.Text, MyFont, Brushes.Black, e.MarginBounds.X, Y)
        Y += CInt(MyFont.GetHeight(e.Graphics))
        e.Graphics.DrawString(txtAddress.Text, MyFont, Brushes.Black, e.MarginBounds.X, Y)
        Y += CInt(MyFont.GetHeight(e.Graphics))
        e.Graphics.DrawString(txtCity.Text + ", " + txtState.Text + " " + txtZip.Text, MyFont, Brushes.Black, e.MarginBounds.X, Y)
        Y += CInt(MyFont.GetHeight(e.Graphics))
        e.Graphics.DrawString(txtPhone.Text, MyFont, Brushes.Black, e.MarginBounds.X, Y)
        Y += CInt(2 * MyFont.GetHeight(e.Graphics))
        e.Graphics.DrawString("Ordered" + Str(NumberPizzas) + " Pizza(s):", MyFont, Brushes.Black, e.MarginBounds.X, Y)
        Dim FoundRows() As DataRow
        FoundRows = PizzasTable.Select("OrderNumber ='" + Str(OrderNumber) + "'")
        For I = 0 To FoundRows.Length - 1
            Y += CInt(2 * MyFont.GetHeight(e.Graphics))
            e.Graphics.DrawString(rdoSize(CInt(FoundRows(I).Item("PizzaSize"))).Text + " Pizza", MyFont, Brushes.Black, e.MarginBounds.X, Y)
            Y += CInt(MyFont.GetHeight(e.Graphics))
            If CInt(FoundRows(I).Item("Delivery")) = 1 Then
                e.Graphics.DrawString("Delivered", MyFont, Brushes.Black, e.MarginBounds.X, Y)
            Else
                e.Graphics.DrawString("To be picked up", MyFont, Brushes.Black, e.MarginBounds.X, Y)
            End If
            S = FoundRows(I).Item("Toppings").ToString
            For J = 0 To NumberToppings - 1
                If Val(Mid(S, J + 1, 1)) = 1 Then
                    Y += CInt(MyFont.GetHeight(e.Graphics))
                    e.Graphics.DrawString(chkTop(J).Text, MyFont, Brushes.Black, e.MarginBounds.X, Y)
                End If
            Next J
            Y += CInt(MyFont.GetHeight(e.Graphics))
            e.Graphics.DrawString("Cost: $" + Format(FoundRows(I).Item("Cost"), "0.00"), MyFont, Brushes.Black, e.MarginBounds.X, Y)
        Next I
        Y += CInt(2 * MyFont.GetHeight(e.Graphics))
        e.Graphics.DrawString("Total Cost: $" + Format(TotalCost, "0.00"), MyFont, Brushes.Black, e.MarginBounds.X, Y)
        e.HasMorePages = False
    End Sub
    Private Sub btnFind_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles btnFind.Click
        Dim L As Integer
        'Check phone number validity (at least that it has enough characters)
        L = Len(txtPhone.Text)
        If L <> 14 Then
            MessageBox.Show("Phone number requires 10 digits.", "Phone Number Error", MessageBoxButtons.OK, MessageBoxIcon.Exclamation)
            txtPhone.Focus()
            Exit Sub
        End If
        CustomersTable.DefaultView.Sort = "PhoneNumber"
        Dim FoundRow As Integer = CustomersTable.DefaultView.Find(txtPhone.Text)
        If FoundRow <> -1 Then
            btnFind.Enabled = False
            grpSize.Enabled = True
            grpDeliver.Enabled = True
            grpToppings.Enabled = True
            txtSpecial.Enabled = True
            btnBuild.Enabled = True
            btnComplete.Enabled = False
            txtPhone.Enabled = False
            txtFirstName.Visible = True
            txtLastName.Visible = True
            txtAddress.Visible = True
            txtCity.Visible = True
            txtState.Visible = True
            txtZip.Visible = True
            txtComment.Visible = True
            TotalCost = 0
            NumberPizzas = 0
            CustomersManager.Position = FoundRow
        Else
            ' code for new customer
            btnFind.Enabled = False
            txtPhone.Enabled = False
            txtFirstName.Visible = True
            txtLastName.Visible = True
            txtAddress.Visible = True
            txtCity.Visible = True
            txtState.Visible = True
            txtZip.Visible = True
            txtComment.Visible = True
            CustomersManager.AddNew()
            txtFirstName.Focus()
            btnSave.Visible = True
            btnCancel.Visible = True
        End If
    End Sub

    Private Sub btnBuild_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles btnBuild.Click
        'This procedure builds a message box that displays your pizza type
        Dim Message As String = ""
        Dim I As Integer
        Dim ToppingString As String
        Dim Cost As Single
        If PizzaSize < 0 Then
            MessageBox.Show("You must choose a size", "Error", MessageBoxButtons.OK, MessageBoxIcon.Information)
            Exit Sub
        End If
        Message += rdoSize(PizzaSize).Text + " pizza" + ControlChars.CrLf
        Cost = SizeCost(PizzaSize)
        ToppingString = ""
        For I = 0 To NumberToppings - 1
            If chkTop(I).Checked Then
                Message += chkTop(I).Text + ControlChars.CrLf
                ToppingString += "1"
                Cost += ToppingCost(I)
            Else
                ToppingString += "0"
            End If
        Next I
        If ToppingString = "000000000000" Then
            Message += "Cheese only" + ControlChars.CrLf
        End If
        If txtSpecial.Text <> "" Then
            Message += txtSpecial.Text + ControlChars.CrLf
        End If
        If chkDeliver.Checked Then
            Message += "To be delivered" + ControlChars.CrLf
            Cost += DeliveryCost
        Else
            Message += "For pickup" + ControlChars.CrLf
        End If
        Message += "Cost is $" + Format(Cost, "0.00")
        'if ok add to database and order; if not just exit
        If MessageBox.Show(Message + ControlChars.CrLf + ControlChars.CrLf + "Is this correct?", "Your Pizza", MessageBoxButtons.YesNo, MessageBoxIcon.Question) = Windows.Forms.DialogResult.Yes Then
            'Add pizza to pizzas table
            Dim NewRow As DataRow = PizzasTable.NewRow
            NewRow.Item("OrderNumber") = OrderNumber
            If chkDeliver.Checked Then
                NewRow.Item("Delivery") = "1"
            Else
                NewRow.Item("Delivery") = "0"
            End If
            NewRow.Item("PizzaSize") = Str(PizzaSize)
            NewRow.Item("Toppings") = ToppingString
            NewRow.Item("SpecialInfo") = txtSpecial.Text
            NewRow.Item("Cost") = Cost
            PizzasTable.Rows.Add(NewRow)
            NumberPizzas += 1
            TotalCost += Cost
            Cost = 0
            PizzaSize = 0
            rdoSize(PizzaSize).Checked = True
            For I = 0 To NumberToppings - 1
                chkTop(I).Checked = False
            Next I
            txtSpecial.Text = ""
            chkDeliver.Checked = False
            btnComplete.Enabled = True
        End If
    End Sub

    Private Sub btnComplete_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles btnComplete.Click
        TotalCost = (1 + TaxRate / 100) * TotalCost
        If MessageBox.Show("Order includes" + Str(NumberPizzas) + " pizza(s)" + ControlChars.CrLf + "Total cost is $" + Format(TotalCost, "0.00") + " (including tax)" + ControlChars.CrLf + ControlChars.CrLf + "Would you like a printed receipt?", "Order Complete", MessageBoxButtons.YesNo, MessageBoxIcon.Question) = Windows.Forms.DialogResult.Yes Then
            'Print receipt
            PrintReceipt()
        End If
        'Write order number to database - get ready for new customer
        Dim NewRow As DataRow = OrdersTable.NewRow
        NewRow.Item("OrderNumber") = OrderNumber
        NewRow.Item("PhoneNumber") = txtPhone.Text
        NewRow.Item("OrderDate") = lblDate.Text
        NewRow.Item("TotalCost") = TotalCost
        OrdersTable.Rows.Add(NewRow)
        OrderNumber += 1
        Me.Text = "Pizza Order #" + Format(OrderNumber, "0000")
        btnFind.Enabled = True
        grpSize.Enabled = False
        grpDeliver.Enabled = False
        grpToppings.Enabled = False
        txtSpecial.Enabled = False
        btnBuild.Enabled = False
        btnComplete.Enabled = False
        txtFirstName.Visible = False
        txtLastName.Visible = False
        txtAddress.Visible = False
        txtCity.Visible = False
        txtState.Visible = False
        txtZip.Visible = False
        txtComment.Visible = False
        txtPhone.Enabled = True
        txtPhone.Text = ""
        txtPhone.Focus()
    End Sub

    Private Sub rdoSize_CheckedChanged(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles rdoSmall.CheckedChanged, rdoMedium.CheckedChanged, rdoLarge.CheckedChanged
        Dim ButtonChecked As RadioButton = CType(sender, RadioButton)
        Select Case ButtonChecked.Name
            Case "rdoSmall"
                PizzaSize = 0
            Case "rdoMedium"
                PizzaSize = 1
            Case "rdoLarge"
                PizzaSize = 2
        End Select
    End Sub

    Private Sub txtPhone_KeyPress(ByVal sender As System.Object, ByVal e As System.Windows.Forms.KeyPressEventArgs) Handles txtPhone.KeyPress
        If e.KeyChar = ControlChars.Cr Then
            btnFind.PerformClick()
        End If
    End Sub

    Private Sub btnSave_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles btnSave.Click
        btnSave.Visible = False
        btnCancel.Visible = False
        CustomersManager.EndCurrentEdit()
        Dim CurrentRow As DataRow = CustomersTable.Rows(CustomersTable.Rows.Count - 1)
        CurrentRow.Item("PhoneNumber") = txtPhone.Text
        btnFind.Enabled = False
        grpSize.Enabled = True
        grpDeliver.Enabled = True
        grpToppings.Enabled = True
        txtSpecial.Enabled = True
        btnBuild.Enabled = True
        btnComplete.Enabled = False
        txtPhone.Enabled = False
        TotalCost = 0
        NumberPizzas = 0
    End Sub

    Private Sub btnCancel_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles btnCancel.Click
        CustomersManager.CancelCurrentEdit()
        btnSave.Visible = False
        btnCancel.Visible = False
        btnFind.Enabled = True
        txtFirstName.Visible = False
        txtLastName.Visible = False
        txtAddress.Visible = False
        txtCity.Visible = False
        txtState.Visible = False
        txtZip.Visible = False
        txtComment.Visible = False
        txtPhone.Enabled = True
        txtPhone.Text = ""
        txtPhone.Focus()
    End Sub
End Class

