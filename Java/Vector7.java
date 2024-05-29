import java.util.*;

class Vector7
{
    public static void main(String args[])
    {
        Vector v = new Vector(7,3);
        v.addElement(new Integer(10));
        v.addElement(new Integer(20));
        v.addElement(new Integer(30));
        v.addElement(new Integer(40));
        v.addElement(new Integer(50));
        v.addElement(new Integer(60));
        
        v.addElement(new String("A"));
        v.addElement(new String("B"));
        v.addElement(new String("C"));
        v.addElement(new String("D"));
        v.addElement(new String("E"));
        v.addElement (new String("F"));
        v.addElement(new String("G"));

        v.addElement(new Float(1.5f));
        v.addElement(new Float(3.5f));

        System.out.println("Initial Vector:"+v);

        v.removeElementAt(2);
        v.removeElementAt(4);
        v.removeElementAt(12);

        System.out.println("After Deletion:"+v);

        Scanner s = new Scanner(System.in);

        System.out.println("Enter a Integer Element to Insert at Index 4:");
        int n=s.nextInt();
        v.insertElementAt(new Integer(n),4);

        System.out.println("Enter a Float Element to Insert at Index 6:");
        float m=s.nextFloat();
        v.insertElementAt(new Float(m),6);

        System.out.println("Enter a String Element to Insert at Index 12:");
        String l=s.next();
        v.insertElementAt(new String(l),12);

            
        System.out.println("Capacity of Vector:"+v.capacity());
       
        System.out .println("Size of Vector:"+v.size());
       
        System.out.println("Vector after Insertion:"+v);
        
    }
}