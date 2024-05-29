Imports System.Console
Module Module1

    Sub Main()
        Dim a, b, c, ch As Integer
        WriteLine("Enter value of first number:")
        a = ReadLine()
        WriteLine("Enter value of second number:")
        b = ReadLine()

        WriteLine("---------MENU----------")
        WriteLine("1. Addition")
        WriteLine("2. Subtraction")
        WriteLine("3. Multiplication")
        WriteLine("4. Division")
        WriteLine("Enter Your choice:")
        ch = ReadLine()

        Select Case (ch)
            Case 1
                c = a + b
                WriteLine("Addition:" & c)
            Case 2
                c = a - b
                WriteLine("Subtraction:" & c)
            Case 3
                c = a * b
                WriteLine("Multiplication:" & c)
            Case 4
                c = a / b
                WriteLine("Division:" & c)
            Case Else
                WriteLine("Enter a valid choice....")
        End Select
        ReadLine()

    End Sub

End Module
