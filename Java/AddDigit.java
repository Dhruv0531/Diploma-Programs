import java.util.*;
class AddDigit
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Any Number: ");
        int num=s.nextInt();
        int sum=0;
        while(num>0)
        {
            int digit=num%10;
            sum=sum+digit;
            num=num/10;   
        }
        System.out.println("Sum of Digits: "+sum);
        s.close();
    }
}