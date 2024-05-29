import java.util.*;

class Vector1
{
    public static void main(String args[])
    {
        Vector v= new Vector();

        v.addElement(5);
        v.addElement(15);
        v.addElement(25);
        v.addElement(35);
        v.addElement(45);
        
        System.out.println("Vector Elements:"+v);

        v.insertElementAt(new Integer(55),1);
        
        System.out.println("After Insertion:"+v);
        
        v.removeElementAt(0);
        v.removeElementAt(3);

        System.out.println("After Deletion:"+v);
    }
}