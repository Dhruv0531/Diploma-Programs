import java.awt.*;

class ListDemo
{
    void display(){

        Frame ld = new Frame("List");
        ld.setLayout(null);
        ld.setSize(500,500);

        List ls = new List();
        ls.add("Lokmat");
        ls.add("Divya Marathi");
        ls.add("Times of India");

        ls.setBounds(75,75,250,150);
        ld.add(ls);

        ld.setVisible(true);
    }

    public static void main(String[] args) {
        ListDemo l = new ListDemo();
        l.display();
    }
}