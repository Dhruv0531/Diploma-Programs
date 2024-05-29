Imports System.Console
Imports System.Text.RegularExpressions
Module Module1

    Sub Main()
        Dim regex As Regex = New Regex("\d+")
        Dim str As String
        WriteLine("Enter a String:")
        str = ReadLine()
        Dim match As Match = regex.Match(str)
        WriteLine("Digits In String:")
        WriteLine(match.Value)
        ReadLine()
    End Sub

End Module
