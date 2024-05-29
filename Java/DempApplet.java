import java.applet.*;
import java.awt.*;

public class DempApplet extends Applet
{
    public void paint(Graphics g)
    {
        g.setColor(Color.red);
        g.fillOval(100, 250, 50, 90);
    }
}