import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class DemoMouseEvent extends Applet implements MouseListener
{
    public void init()
    {
        setVisible(true);
        this.addMouseListener(this);
    }
    public void mouseEntered(MouseEvent me)
    {
        showStatus("Mouse Entered");
    }
    public void mousePressed(MouseEvent me)
    {
        showStatus("Mouse Pressed");
    }
    public void mouseReleased(MouseEvent me)
    {
        showStatus("Mouse Released");
    }
    public void mouseClicked(MouseEvent me)
    {
        int x,y;
        x = me.getX();
        y = me.getY();
        showStatus("Mouse Clicked at x="+x+"y="+y);
    }
    public void mouseExited(MouseEvent me)
    {
        showStatus("Mouse Exited");
    }
}

/* <applet code="DemoMouseEvent" width=500 height=500></applet>*/