import java.util.*;

class Vector4
{
    public static void main(String args[])
    {
        Vector v = new Vector<Integer>();
        Scanner s = new Scanner(System.in);

        v.addElement((10));
        v.addElement((20));
        v.addElement((30));
        v.addElement((40));
        v.addElement((50));

        System.out.println("Initial Vector:"+v);

        System.out.println("Enter Element to Delete:");
        int num=s.nextInt();

        v.removeElement((num));

        System.out.println("After Deletion:"+v);
    }
}