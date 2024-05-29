import java.awt.*;

class ChoiceDemo extends Frame
{
    void display()
    {
        setLayout(null);
        setSize(500,500);
        setVisible(true);

        Choice c = new Choice();
        c.add("Select Color");
        c.add("Red");
        c.add("Yellow");
        c.add("Blue");
        c.add("Black");

        c.setBounds(50,50,100,50);

        add(c);
    }

    public static void main(String[] args) {
        ChoiceDemo c = new ChoiceDemo();
        c.display();
    }
}