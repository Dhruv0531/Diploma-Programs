import java.util.*;

class Even
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter Size of Array:");
        int n = s.nextInt();

        int a[] = new int[n];
        System.out.println("Enter "+n+" Array Elements:");
        for(int i=0;i<n;i++)
        {
            a[i] = s.nextInt();
        }
        int sum=0;
        System.out.print("Even Numbers in Array:");
        for(int i=0;i<n;i++)
        {
            if(a[i]%2==0)
            {
                System.out.print(" "+a[i]);
                sum+=a[i];
            }
        }
        System.out.print("\nAddition of Even Numbers in Array: "+sum);
    }
}