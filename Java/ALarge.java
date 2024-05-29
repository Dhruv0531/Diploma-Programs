import java.util.*;

class ALarge
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter Size of Array:");
        int n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter"+n+" Array Elements:");
        for(int i=0;i<n;i++)
        {
            a[i] = s.nextInt();
        }
        int l=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]>l)
            {
                l = a[i];
            }
        }
        System.out.println("Largest Element of Array:"+l);
        s.close();
    }
}