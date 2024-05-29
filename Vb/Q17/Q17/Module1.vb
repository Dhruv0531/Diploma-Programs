Imports System.Console
Module Module1

    Sub Main()
        Dim obj As New Box
        Dim vol As Integer
        vol = obj.volume(2, 4, 4)
        WriteLine("Length:" & obj.l)
        WriteLine("Breadth:" & obj.b)
        WriteLine("Height:" & obj.h)
        WriteLine("Volume:" & vol)
        ReadLine()
    End Sub
End Module
Class Box
    Public l, b, h As Integer
    Function volume(ByVal i As Integer, ByVal j As Integer, ByVal k As Integer)
        Dim v As Integer
        l = i
        b = j
        h = k
        v = l * b * h
        Return v
    End Function
End Class