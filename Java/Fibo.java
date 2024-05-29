import java.util.*;

class Fibo
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Number:");
        int num=s.nextInt();
        int f1=0,f2=1,sum=0;
        System.out.print("Fibonacci Series:"+f1+" "+f2);
        for(int i=2;i<num;i++)
        {
            sum=f1+f2;
            System.out.print(" "+sum);
            f1=f2;
            f2=sum;
        }
        s.close();
    }
}