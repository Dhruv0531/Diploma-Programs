Imports System.Console

Module Module1
    Sub Main()
        Dim n As Integer = 1
        WriteLine("Odd Numbers from 1 to 100:")
        While (n <= 100)
            If n Mod 2 = 0 Then
                WriteLine(n)
            End If
            n += 1
        End While
        ReadLine()
    End Sub
End Module

