import java.awt.*;

class MenuDemo extends Frame
{
    MenuDemo()
    {
        setLayout(new FlowLayout());
        setSize(500,500);

        MenuBar menu = new MenuBar();
        Menu file = new Menu("File");
        MenuItem item1 = new MenuItem("New");
        MenuItem item2 = new MenuItem("Open");
        MenuItem item3 = new MenuItem("Save");
        MenuItem item4 = new MenuItem("Save As");
        file.add(item1);
        file.add(item2);
        file.add(item3);
        file.add(item4);

        Menu edit = new Menu("Edit");
        Menu format = new Menu("Format");

        menu.add(file);
        menu.add(edit);
        menu.add(format);

        setMenuBar(menu);
        setVisible(true);
    }

    public static void main(String[] args) {
        MenuDemo m = new MenuDemo();
    }
}