Public Class Form1

    Private Sub Button1_Click(sender As Object, e As EventArgs) Handles Button1.Click
        Dim num1, num2, div As Integer
        num1 = Val(TextBox1.Text)
        num2 = Val(TextBox2.Text)
        Try
            div = num1 / num2
            MsgBox("Division:" & div)
        Catch ex As Exception
            Console.WriteLine("Division of {0} by zero", num1)
        End Try
    End Sub
End Class
