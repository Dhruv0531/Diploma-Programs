import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class KeyDemo extends Applet implements KeyListener
{
    Label l1 = new Label();
    public void init()
    {
        setLayout(null);
        setVisible(true);
        this.addKeyListener(this);
    }
    public void keyPressed(KeyEvent ke)
    {
        showStatus("Key Pressed:"+ke.getKeyCode());
        l1.setText("Key Pressed is:"+ke.getKeyChar());
        l1.setBounds(100,100,200,30);
        add(l1);
    }
    public void keyReleased(KeyEvent ke){}
    public void keyTyped(KeyEvent ke){}
}
/* <applet code = "KeyDemo" width=300 height=300></applet>*/