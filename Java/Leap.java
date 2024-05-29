import java.util.*;
class Leap
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.print("\nEnter Any Year:");
        int year=s.nextInt();
        if(year%4==0)
        {
            System.out.println(year+" is Leap Year");
        }
        else
        {
            System.out.println(year+" is Not a Leap Year");
        }
        s.close();
    }
}