Imports System.Console
Module Module1

    Sub Main()
        Dim obj As New EmpInfo
        obj.ShowInfo()
        ReadLine()

    End Sub

End Module

Public Class EmpPersonalDetails
    Dim name As String
    Dim address As String
    Public Overridable Function ShowInfo()
        WriteLine("Employee Name:" & name)
        WriteLine("Employee Address:" & address)
    End Function
End Class

Public Class EmpInfo
    Inherits EmpPersonalDetails
    Dim EmpId As Integer
    Dim salary As Integer
    Dim joindate As Date
    Overloads Function ShowInfo()
        MyBase.ShowInfo()
        WriteLine("Employee Id:" & EmpId)
        WriteLine("Employee Salary:" & salary)
        WriteLine("Employee Joinning date:" & joindate)
    End Function
End Class