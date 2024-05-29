Imports System.Console
Module Module1

    Sub Main()
        Dim a, b, c As Integer
        WriteLine("Enter first number:")
        a = ReadLine()
        WriteLine("Enter Second Number:")
        b = ReadLine()
        WriteLine("Enter Third Number:")
        c = ReadLine()

        If (a > b) Then
            If (a > c) Then
                WriteLine("Largest number is :" & a)
            Else
                WriteLine("Largest Number is:" & c)
            End If
        Else
            If (b > c) Then
                WriteLine("Largest Number is:" & b)
            Else
                WriteLine("Largest Number is:" & c)
            End If
        End If
        ReadLine()
    End Sub

End Module
