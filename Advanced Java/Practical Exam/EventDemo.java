import java.awt.*;
import java.awt.event.*;

public  class EventDemo extends Frame implements ActionListener
{
    Label l1,l2,l3;
    TextField t1,t2;
    EventDemo()
    {
        setLayout(null);
        setSize(500,500);

         l1 = new Label("Enter Username");
         l2 = new Label("Enter Password");
         l3 = new Label();

        t1 = new TextField();
        t2 = new TextField();

        Button b = new Button("Login");

        l1.setBounds(100,100,100,20);
        t1.setBounds(200,100,70,20);
        l2.setBounds(100,150,100,20);
        t2.setBounds(200,150,70,20);
        b.setBounds(100,200,80,20);
        l3.setBounds(200,250,100,20);

        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(b);
        add(l3);

        b.addActionListener(this);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae)
    {
        String s1 = ae.getActionCommand();
        String s2 = t2.getText();

        if(s1.equals("Login"))
        {
            if(s2.equals("ssvps@123"))
            {
                l3.setText("Welcome");
            }
            else
            {
                l3.setText("Invalid Password");
            }
        }
    }

    public static void main(String[] args) {
        EventDemo e = new EventDemo();
    }
}