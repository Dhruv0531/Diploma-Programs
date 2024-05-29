import java.util.*;

class EvenNoException extends Exception
{
    EvenNoException(int n)
    {
        super("Number is even:"+n);
    }
}

class EDemo
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a Number:");
        int num = s.nextInt();
        try
        {
            if(num%2!=0)
            {
                System.out.println("Number is Odd");
            }
            else
            {
                
                throw new EvenNoException(num);
            }
        }
        catch(EvenNoException e)
        {
            System.out.println(e);
        }

    }
}