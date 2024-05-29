import java.util.*;

class Largest
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Three Numbers:");
        int a=s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();

        if(a>b)
        {
            if(a>c)
            {
                System.out.println(a+" is Latgest");
            }
            else
            {
                System.out.println(c+" is Largest");
            }
        }
        else
        {
            if(b>c)
            {
                System.out.println(b+" is Largest");
            }
            else
            {
                System.out.println(c+" is Largest");
            }
        }
        s.close();
            
    }
}