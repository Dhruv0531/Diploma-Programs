Public Class calculator

    ' two numbers to do the calc 
    Dim num1, num2 As Double
    ' check if an operator is clicked for the first time 
    Dim oprClickCount As Integer = 0
    ' check if an operator is clicked befor 
    Dim isOprClick As Boolean = False
    ' check if equal is clicked befor 
    Dim isEqualClick As Boolean = False
    ' get the operator 
    Dim opr As String

    Private Sub calculator_Load(sender As Object, e As EventArgs) Handles MyBase.Load

        ' add click event to all button in the form 
        For Each c As Control In Controls

            ' if the control is button 
            If c.GetType() = GetType(Button) Then
                If Not c.Text.Equals("Reset") Then
                    ' add action to the button 
                    AddHandler c.Click, AddressOf btn_Click
                End If


            End If

        Next

    End Sub

    ' create a button click event 
    Private Sub btn_Click(sender As Object, e As EventArgs)

        Dim button As Button = sender

        If Not isOperator(button) Then
            ' if number 
            If isOprClick Then
                ' if an opr is clicked 
                ' get and convert to double textbox text 
                num1 = Double.Parse(TextBox1.Text)
                ' clear textbox text 
                TextBox1.Text = ""
            End If

            If Not TextBox1.Text.Contains(".") Then
                ' if "." not already in the textbox 
                If TextBox1.Text.Equals("0") AndAlso Not button.Text.Equals(".") Then
                    TextBox1.Text = button.Text
                    isOprClick = False
                Else
                    TextBox1.Text += button.Text
                    isOprClick = False
                End If

            ElseIf Not button.Text.Equals(".") Then
                ' if the button is not a "." 
                TextBox1.Text += button.Text
                isOprClick = False
            End If

        Else
            ' if operator 
            If oprClickCount = 0 Then
                ' if we click on an operator for the first time 
                oprClickCount += 1
                num1 = Double.Parse(TextBox1.Text)
                opr = button.Text
                isOprClick = True

            Else
                If Not button.Text.Equals("=") Then
                    ' if the button is not "=" 
                    If Not isEqualClick Then
                        ' if "=" is not clicked befor 
                        num2 = Double.Parse(TextBox1.Text)
                        TextBox1.Text = Convert.ToString(calc(opr, num1, num2))
                        num2 = Double.Parse(TextBox1.Text)
                        opr = button.Text
                        isOprClick = True
                        isEqualClick = False

                    Else

                        isEqualClick = False
                        opr = button.Text

                    End If

                Else

                    num2 = Double.Parse(TextBox1.Text)
                    TextBox1.Text = Convert.ToString(calc(opr, num1, num2))
                    num1 = Double.Parse(TextBox1.Text)
                    isOprClick = True
                    isEqualClick = True

                End If

            End If

        End If


    End Sub

    ' create a function to check if the button is a number or an operator 
    Function isOperator(ByVal btn As Button) As Boolean

        Dim btnText As String
        btnText = btn.Text

        If (btnText.Equals("+") Or btnText.Equals("-") Or btnText.Equals("/") Or
            btnText.Equals("X") Or btnText.Equals("=")) Then
            Return True
        Else
            Return False
        End If

    End Function

    ' create a function to do the calc 
    Function calc(ByVal op As String, ByVal n1 As Double, ByVal n2 As Double) As Double

        Dim result As Double
        result = 0

        Select Case op

            Case "+"
                result = n1 + n2
            Case "-"
                result = n1 - n2
            Case "X"
                result = n1 * n2
            Case "/"
                If n2 <> 0 Then
                    result = n1 / n2
                End If

        End Select

        Return result

    End Function

    Private Sub ButtonReset_Click(sender As Object, e As EventArgs) Handles ButtonReset.Click

        num1 = 0
        num2 = 0
        opr = ""
        oprClickCount = 0
        isOprClick = False
        isEqualClick = False
        TextBox1.Text = "0"

    End Sub
End Class