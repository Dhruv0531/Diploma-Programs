import java.awt.*;

class ChoiceDemo
{
    void display()
    {
        Frame ch = new Frame("Choice");
        ch.setLayout(null);
        ch.setSize(300,150);

        Label select = new Label("Select Color:");
        select.setBounds(50,50,100,50);

        Choice color = new Choice();
        color.add("Black");
        color.add("Pink");
        color.add("Yellow");
        color.add("Red");
        color.setBounds(150,65,75,50);

        ch.add(select);
        ch.add(color);

        ch.setVisible(true);
    }

    public static void main(String[] args) {
        ChoiceDemo c = new ChoiceDemo();
        c.display();
    }
}