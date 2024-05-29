import javax.swing.*;
import javax.swing.tree.*;

class TreeDemo extends JFrame
{
    TreeDemo()
    {
        setTitle("JTree");
        DefaultMutableTreeNode r1 = new DefaultMutableTreeNode("AWT");
        DefaultMutableTreeNode ch1 = new DefaultMutableTreeNode("Component");
        r1.add(ch1);
        DefaultMutableTreeNode ch2 = new DefaultMutableTreeNode("Container");
        ch1.add(ch2);

        JTree t1 = new JTree(r1);
        add(t1);
        setSize(250,250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        TreeDemo t = new TreeDemo();
    }
}