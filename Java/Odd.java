class Odd
{
    public static void main(String args[])
    {
        int sum=0;
        System.out.println("Addition of Even Numbers from 1 to 50:");
        for(int i=1;i<=50;i++)
        {
            if(i%2!=0)
            {
                sum=sum+i;
            }
        }
        System.out.print(+sum);
    }
}