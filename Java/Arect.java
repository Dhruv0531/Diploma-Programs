import java.util.*;

class Arect
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Length:");
        float l=s.nextFloat();
        System.out.println("Enter Width:");
        float w=s.nextFloat();
        float area=l*w;
        System.out.println("Area of Rectangle:"+area);
        float peri=2*(l+w);
        System.out.println("Perimeter of Rectangle:"+peri);
        s.close();
    }
}