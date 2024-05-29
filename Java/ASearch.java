import java.util.*;

class ASearch
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);

        int a[] = new int[10];

        System.out.println("Enter 10 Array Elements:");
        for(int i=0;i<10;i++)
        {
            a[i] = s.nextInt();
        }

        System.out.println("Enter Key Element to Search:");
        int key = s.nextInt();

        int flag = 0,i;
        for(i=0;i<10;i++)
        {
            if(a[i]==key)
            {
                flag = 1;
                break;
            }
        }

        if(flag == 1)
        {
            System.out.println(key+ " Found at index "+i);
        }
        else
        {
            System.out.println("Element not Found");
        }
        s.close();
    }
}