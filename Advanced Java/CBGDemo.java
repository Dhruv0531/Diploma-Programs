import java.awt.*;

class CBGDemo extends Frame {
    void display() {
        setLayout(new FlowLayout());
        setSize(500, 500);
        setVisible(true);

        CheckboxGroup gender = new CheckboxGroup();
        Checkbox c1 = new Checkbox("Male", false, gender);
        Checkbox c2 = new Checkbox("Female", false, gender);

        add(c1);
        add(c2);
    }

    public static void main(String[] args) {
        CBGDemo c = new CBGDemo();
        c.display();
    }
}