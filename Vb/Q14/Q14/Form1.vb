'Write a program using Error Provider control to validate the Mobile number and Email id
Imports System.Text.RegularExpressions
Public Class Form1

    Private Sub Form1_Load(sender As Object, e As EventArgs) Handles MyBase.Load

    End Sub

    Private Sub Button1_Click(sender As Object, e As EventArgs) Handles Button1.Click
        Dim number As New Regex("\d{10}")
        If number.IsMatch(TextBox1.Text) Then
            ErrorProvider1.SetError(TextBox1, "")
            MsgBox("Valid Phone Number")
        Else
            ErrorProvider1.SetError(TextBox1, "Invalid Phone Number")
        End If

        Dim regex As Regex = New Regex("^([\w-\.]+)@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.)|(([\w-]+\.)+))([a-zA-Z]{2,4}|[0-9]{1,3})(\]?)$")
        Dim isValid As Boolean = regex.IsMatch(TextBox2.Text.Trim)
        If Not isValid Then
            ErrorProvider1.SetError(TextBox2, "Invalid E-mail ID")
        Else
            ErrorProvider1.SetError(TextBox2, "")
            MsgBox("Valid E-Mail ID")
        End If
    End Sub
End Class
