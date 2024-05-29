import javax.swing.*;

class Student
{
    void display()
    {
        JFrame stud = new JFrame("Student Registration Form");
        stud.setLayout(null);
        stud.setSize(700,700);

        JLabel name = new JLabel("Enter Name:");
        JTextField name_tf = new JTextField();
        name.setBounds(50,50,50,50);
        name_tf.setBounds(100,50,50,50);

        JLabel address = new JLabel("Enter Address:");
        JTextArea address_ta  = new JTextArea();
        address.setBounds(50,100,50,50);
        address_ta.setBounds(150,100,50,50);

        JLabel email = new JLabel ("Enter Email Address:");
        JTextField email_tf = new JTextField();
        email.setBounds(50,150,50,50);
        email_tf.setBounds(100,150,50,50);

        JRadioButton gender = new JRadioButton();

    }
}
