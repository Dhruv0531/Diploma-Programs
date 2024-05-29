import java.awt.*;

class CheckboxDemo extends Frame
{
    void display()
    {
        setLayout(new FlowLayout());
        setSize(500,500);
        setVisible(true);

        Checkbox c1 = new Checkbox("AJP");
        Checkbox c2 = new Checkbox("STE");
        Checkbox c3 = new Checkbox("OSY");
        Checkbox c4 = new Checkbox("EST");
        Checkbox c5 = new Checkbox("CPP");

        add(c1);
        add(c2);
        add(c3);
        add(c4);
        add(c5);
    }

    public static void main(String[] args) {
        CheckboxDemo c = new CheckboxDemo();
        c.display();
    }
}