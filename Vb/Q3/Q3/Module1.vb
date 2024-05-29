Imports System.Console
Module Module1

    Sub Main()
        Dim n, m As Integer
        n = 1
        WriteLine("Prime Numbers From 1 to 100:")
        While (n <= 100)
            m = 2
            While (m < n)
                If (n Mod m = 0) Then
                    Exit While
                ElseIf (n = m + 1) Then
                    WriteLine(n)
                End If
                m = m + 1
            End While
            n = n + 1
        End While
        ReadLine()
    End Sub

End Module
