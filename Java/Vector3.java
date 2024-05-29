import java.util.*;
class Vector3
{
    public static void main(String args[])
    {
        Vector v = new Vector<Integer>();
        
        System.out.println("Before Adding Elements \nSize:"+v.size());
        v.addElement((10)); 
        v.addElement((30));
        v.addElement((50));
        v.addElement((20));

        System.out.println("After Adding Elements \nSize:"+v.size());
        
        System.out.println("Initial Vector:"+v);
    }
}