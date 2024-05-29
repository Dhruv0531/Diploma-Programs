Public Class Form1

    Private Sub Form1_Load(sender As Object, e As EventArgs) Handles MyBase.Load
        ComboBox1.Items.Add(5)
        ComboBox1.Items.Add(8)
        ComboBox1.Items.Add(12)
        ComboBox1.Items.Add(20)
        ComboBox1.Items.Add(32)

        ComboBox2.Items.Add(6)
        ComboBox2.Items.Add(11)
        ComboBox2.Items.Add(17)
        ComboBox2.Items.Add(24)
        ComboBox2.Items.Add(36)
    End Sub

    Private Sub Button1_Click(sender As Object, e As EventArgs) Handles Button1.Click
        Dim avg As Decimal
        avg = (Val(ComboBox1.Text) + Val(ComboBox2.Text)) / 2
        MsgBox("Average:" & avg)

    End Sub
End Class
