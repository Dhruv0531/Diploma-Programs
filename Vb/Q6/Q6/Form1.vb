Public Class Form1

    Private Sub Button1_Click(sender As Object, e As EventArgs) Handles Button1.Click
        Dim c As Integer = 0
        For i = 0 To TextBox1.Text.Length - 1
            Select Case (i)
                Case "a", "e", "i", "o", "u"
                    c = c + 1
            End Select
            MsgBox("Number of vowels:" & c)
        Next

    End Sub
End Class
