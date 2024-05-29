import java.util.*;
class Factorial
{
    public static void main(String args[])
    {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter Number:");
        int num=s.nextInt();
        int fact=1;
        for(int i=num;i>0;i--)
        {
            fact=fact*i;
        }
        System.out.println("Factorial of "+num+":"+ fact);
        s.close();
    }
}