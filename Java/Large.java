import java.util.*;

class Large
{
    public static void main(String args[])
   { 
    Scanner s=new Scanner(System.in);
    System.out.println("Enter First Number:");
    int n1=s.nextInt();
    System.out.println("Enter Second Number:");
    int n2=s.nextInt();
    if(n1>n2)
    {
        System.out.println(n1+"is Largest");
    }
    else
    {
        System.out.println(n2+"is Largest");
    }
    s.close();
  }
}