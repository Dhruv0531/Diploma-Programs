Imports System.Console
Module Module1

    Sub Main()
        Dim n As Integer
        WriteLine("Enter Number:")
        n = ReadLine()
        WriteLine("Result :")
        WriteLine(Fact(n))
        ReadLine()
    End Sub
    Function Fact(ByRef n As Integer)
        If n = 0 Then
            Fact = 1
        Else
            Fact = n * Fact(n - 1)
        End If
    End Function

End Module
