import java.util.*;

class Vector2
{
    public static void main(String args[])
    {
        Vector v= new Vector();

        v.addElement(new Integer(10));
        v.addElement(new Integer(20) );
        v.addElement(new Float(3.9f));
        v.addElement(new Float(2.1f));
        v.addElement(new String("Hello"));
        v.addElement(new String("World!"));

        System.out.println("Initial Vector:"+v);

        v.removeElementAt(4);
        System.out.println("After Removing:"+v);

    }
}