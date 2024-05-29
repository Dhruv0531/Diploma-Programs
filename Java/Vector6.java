import java.util.*;

class Vector6
{
    public static void main(String args[])
    {
        int num=0;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter size of vector:");
        int size = s.nextInt();

        Vector v = new Vector<Integer>();
        System.out.println("Enter elements:");
        for(int i=0;i<size;i++)
        {
            num = s.nextInt();
            v.addElement((num));
        }
        System.out.println("Vector Elements:"+v);
        
        System.out.println("Enter Element to Delete:");
        num = s.nextInt();
        v.removeElement((num));
        
        System.out.println("After Deletion:"+v);
        s.close();
    }
}