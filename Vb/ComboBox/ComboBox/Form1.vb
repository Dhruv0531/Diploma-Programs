Public Class Form1

    Private Sub ListBox1_SelectedIndexChanged(sender As Object, e As EventArgs) Handles ListBox1.SelectedIndexChanged
        
    End Sub

    Private Sub Form1_Load(sender As Object, e As EventArgs) Handles MyBase.Load
        ComboBox1.Items.Add("Semister 1")
        ComboBox1.Items.Add("Semister 2")
        ComboBox1.Items.Add("Semister 3")
        ComboBox1.Items.Add("Semister 4")
        ComboBox1.Items.Add("Semister 5")
        ComboBox1.Items.Add("Semister 6")

    End Sub

    Private Sub ComboBox1_SelectedIndexChanged(sender As Object, e As EventArgs) Handles ComboBox1.SelectedIndexChanged
        If ComboBox1.SelectedIndex = 0 Then
            ListBox1.Items.Clear()
            ListBox1.Items.Add("1. English")
            ListBox1.Items.Add("2. Physcis and Chemistry")
            ListBox1.Items.Add("3. Basic Mathematics(M1)")
            ListBox1.Items.Add("4. Fundamentals of ICT")
            ListBox1.Items.Add("5. Engineering Graphics")
            ListBox1.Items.Add("6. Workshop Practice")
        End If

        If ComboBox1.SelectedIndex = 1 Then
            ListBox1.Items.Clear()
            ListBox1.Items.Add("1. Elements of Electrical Engineering(EEE)")
            ListBox1.Items.Add("2. Applied Mathematics(M2)")
            ListBox1.Items.Add("3. Basic Electronics (BEC)")
            ListBox1.Items.Add("4. Programming in 'C'(PIC)")
            ListBox1.Items.Add("5. Business Communication Using Computers(BCC)")
            ListBox1.Items.Add("6. Computer Peripherals and Hardware Maintainance(CPH)")
            ListBox1.Items.Add("7. Web Page Designing With HTML(WPD)")
        End If

        If ComboBox1.SelectedIndex = 2 Then
            ListBox1.Items.Clear()
            ListBox1.Items.Add("1. Object Priented Programming Using C++ (OOP) ")
            ListBox1.Items.Add("2. Data Structures Using C (DSU)")
            ListBox1.Items.Add("3. Computer Graphics (CGR)")
            ListBox1.Items.Add("4. Database Management System (DMS)")
            ListBox1.Items.Add("5. Digital Techniques (DTE)")
        End If

        If ComboBox1.SelectedIndex = 3 Then
            ListBox1.Items.Clear()
            ListBox1.Items.Add("1. Java Programming ")
            ListBox1.Items.Add("2. Software Engineering")
            ListBox1.Items.Add("3. Data Communications and Computer Network")
            ListBox1.Items.Add("4. Microporssors")
            ListBox1.Items.Add("5. GUI Application Development Using Vb.Net")
        End If

        If ComboBox1.SelectedIndex = 4 Then
            ListBox1.Items.Clear()
            ListBox1.Items.Add("1. Environmental Studies")
            ListBox1.Items.Add("2. Operating Systems")
            ListBox1.Items.Add("3. Adavnced Java Programming")
            ListBox1.Items.Add("4. Software Testing")
            ListBox1.Items.Add("5. ELective-1")
            ListBox1.Items.Add("6. Industrial Training")
            ListBox1.Items.Add("7. Capstone Project Planning")
            
        End If

        If ComboBox1.SelectedIndex = 5 Then
            ListBox1.Items.Clear()
            ListBox1.Items.Add("1. Management")
            ListBox1.Items.Add("2. Programming With Python")
            ListBox1.Items.Add("3. Mobile Application Development")
            ListBox1.Items.Add("4. Emerging Trends in Computer and Information Technology")
            ListBox1.Items.Add("5. Elective-2")
            ListBox1.Items.Add("6. Enterpreneurship Development")
            ListBox1.Items.Add("7. Capstone Project - Execution and Report Writing")
        End If
    End Sub

    Private Sub Label1_Click(sender As Object, e As EventArgs) Handles Label1.Click

    End Sub
End Class
