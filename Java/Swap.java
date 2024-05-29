import java.util.*;

class Swap
{
    public static void main(String args[])
    {
       Scanner s=new Scanner (System.in);
       System.out.println("Enter A:");
       int a=s.nextInt();
       System.out.println("Enter B:");
       int b=s.nextInt();
       System.out.println("Before Swapping: A="+a+"\tB="+b);
       int temp=a;
       a=b;
       b=temp;
       System.out.println("After Swapping:+ A="+a+"\tB="+b);
       s.close();
    }
}