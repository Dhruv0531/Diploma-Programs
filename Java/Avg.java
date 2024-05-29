import java.util.*;

class Avg
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Marks of Subject 1:");
        int s1=s.nextInt();
        System.out.println("Enter Marks of Subject 2:");
        int s2=s.nextInt();
        System.out.println("Enter Marks of Subject 3:");
        int s3=s.nextInt();
        int total=s1+s2+s3;
        System.out.println("Total of 3 Subjects:"+total);
        float avg=total/3;
        System.out.println("Average of 3 Subjects:"+avg);
        s.close();
    }
}