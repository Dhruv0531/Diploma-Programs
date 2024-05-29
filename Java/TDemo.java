class A extends Thread
{
    public void run()
    {
        for(int i=1;i<=20;i++)
        {
            if(i%2!=0)
            {
                System.out.println(i);
            }
        }
    }
}
class B extends Thread
{
    public void run()
    {
        for(int i=1;i<=20;i++)
        {
            if(i%2==0)
            {
                System.out.println(i);
            }
        }
    }
}
class TDemo
{
    public static void main(String args[])
    {
        A a = new A();
        System.out.println("Odd Nummbers:");
        a.start();
        System.out.println("Even Numbers:");
        B b = new B();
        b.start();
    }
}