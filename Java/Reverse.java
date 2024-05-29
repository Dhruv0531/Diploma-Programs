import java.util.*;
class Reverse
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Any Number:");
        int num=s.nextInt();
        int digit=0;
        int rev=0;
        while(num>0)
        {
            int rem=num%10;
            digit=(digit*10)+rem;
            num=num/10;
        }
        
        System.out.println("Reverse Number:"+rev);
        s.close();
    }
}