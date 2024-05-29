import javax.swing.*;
import java.awt.*;

class CBB extends JFrame
{
    CBB()
    {
        setTitle("ComboBox");
        setLayout(new FlowLayout());
        setSize(300,150);

        JComboBox lang = new JComboBox();
        lang.addItem("English");
        lang.addItem("Hindi");
        lang.addItem("Marathi");
        lang.addItem("Sanskrit");

        add(lang);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        CBB c = new CBB();
    }
}