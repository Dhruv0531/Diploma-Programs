Imports System.Console
Module Module1

    Sub Main()
        Dim obj As New Circle(2)
        obj.area()
        ReadLine()
    End Sub
End Module

Class Circle
    Dim p As Double = 3.14
    Dim r, a As Double
    Public Sub New(ByVal i As Integer)
        r = i
    End Sub
    Sub area()
        a = p * r * r
        WriteLine("Area of Circle:" & a)
    End Sub
End Class
