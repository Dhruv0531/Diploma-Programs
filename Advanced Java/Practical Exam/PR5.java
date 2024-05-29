import java.awt.*;

class CardDemo extends Frame
{
    CardDemo()
    {
        setTitle("Card Layout");
        setSize(500,500);
        setLayout(new CardLayout());

        Button b1 = new Button("Button 1");
        Button b2 = new Button("Button 2");
        Button b3 = new Button("Button 3");
        Button b4 = new Button("Button 4");

        add(b1,"1");
        add(b2,"2");
        add(b3,"3");
        add(b4,"4");

        setVisible(true);
    }

    public static void main(String[] args) {
        CardDemo c = new CardDemo();
    }
}