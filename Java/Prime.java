import java.util.*;
class Prime
{
    public static void main(String args[])
    {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter Number:");
        int num=s.nextInt();
        int flag=0;

        for(int i=2;i<num;i++)
        {
            if(num%i==0)
            {
                flag=1;
                break;
            }
        }
        if(flag==0)
        {
            System.out.println(num+ " is prime number");
        }
        else{
            System.out.println(num+ "is not prime");
        }
        s.close();
    }
}