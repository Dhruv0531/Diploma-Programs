import java.awt.*;

class LabelDemo extends Frame
{
    void display()
    {
        Label l1 = new Label("Name: Dhruv Harish Makhija");
        Label l2 = new Label("Div: A");
        Label l3 = new Label("Roll No: 52");
        Button b = new Button("Submit");

        setLayout(null);
        setSize(500,500);
        setVisible(true);

        l1.setBounds(30,50,150,25);
        l2.setBounds(30,75,50,25);
        l3.setBounds(30,100,100,25);
        b.setBounds(150,150,50,25);

        add(l1);
        add(l2);
        add(l3);
        add(b);
    }

    public static void main(String[] args)
    {
        LabelDemo l = new LabelDemo();
        l.display();
    }
}