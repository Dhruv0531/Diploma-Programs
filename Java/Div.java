import java.util.*;
class Div
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a Number:");
        int num=s.nextInt();
        if(num%7==0)
        {
            System.out.println(num+" is Divisible by 7");
        }
        else
        {
            System.out.println(num+" is Not Divisible by 7");
        }
        s.close();
    }
}