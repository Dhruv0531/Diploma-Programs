import java.util.*;

class Addition
{
  public static void main(String args[])
  {
    Scanner s=new Scanner(System.in);
    System.out.println("Enter A:");
    int a=s.nextInt();
    System.out.println("Enter B:");
    int b=s.nextInt();
    int c=a+b;
    System.out.println("Addition:"+c);
    s.close();
  }
}