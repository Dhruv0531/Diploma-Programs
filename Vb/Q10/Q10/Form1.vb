Public Class Form1

    Private Sub Form1_Load(sender As Object, e As EventArgs) Handles MyBase.Load
        Dim nbutton As New Button
        nbutton.Name = "nbutton"
        nbutton.Size = New Size(148, 23)
        nbutton.Location = New Point(53, 29)
        nbutton.Text = "Click me"
        Me.Controls.Add(nbutton)
    End Sub
End Class
