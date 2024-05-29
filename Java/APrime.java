import java.util.*;

class APrime
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);

        int a[] = new int[5];

        int flag = 0;

        System.out.println("Enter Array Elements:");
        for(int i=0;i<5;i++)
        {
            a[i] = s.nextInt();
        }

        System.out.println("PRIME NUMBERS:");
        for(int i=0;i<5;i++)
        {
            flag = 0;
            for(int j=2;j<a[i]/2;j++)
            {
                if(a[i]%j==0)
                    flag =1;
            }
            if(flag == 0)
            {
                System.out.println(a[i]);
            }
        }
        s.close();
    }
}