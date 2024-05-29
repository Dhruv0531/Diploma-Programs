import javax.swing.*;

class SwingDemo extends JFrame
{
    SwingDemo()
    {
        setSize(1000,1000);
        setLayout(null);

        JLabel l1 = new JLabel("Name:");
        JTextField t1 = new JTextField();
        l1.setBounds(100,50,100,20);
        t1.setBounds(220,50,200,20);
        add(l1);
        add(t1);

        JLabel l2 = new JLabel("Enter Your Address:");
        JTextArea t2 = new JTextArea();
        l2.setBounds(100,100,150,20);
        t2.setBounds(220,100,200,100);
        add(l2);
        add(t2);


        JRadioButton r1 = new JRadioButton("Male",false);
        JRadioButton r2 = new JRadioButton("Female",false);
        r1.setBounds(250,200,100,50);
        r2.setBounds(350,200,100,50);

        add(r1);
        add(r2);



































        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingDemo s = new SwingDemo();
    }
}