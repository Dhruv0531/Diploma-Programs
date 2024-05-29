import java.awt.*;

class ListDemo extends  Frame
{
    void display()
    {
        setLayout(null);
        setSize(500,500);
        setVisible(true);

        List li = new List();
        li.add("Times of India");
        li.add("Sakal");
        li.add("Divya Marathi");
        li.add("Murder");
        li.add("Lokmat");

        li.setBounds(100,100,100,100);

        add(li);
    }

    public static void main(String[] args) {
        ListDemo l = new ListDemo();
        l.display();
    }
}