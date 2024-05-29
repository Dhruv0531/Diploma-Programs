interface Exam
{
    void calculate();
}

class Student
{
    int roll_no,m1,m2;
    String name;

    Student(int rn, String nm, int x, int y )
    {
        roll_no=rn;
        name=nm;
        m1=x;
        m2=y;
    }
}

class Result extends Student implements Exam
{
    Result(int rn, String nm, int x, int y)
    {
        super(rn, nm, x, y);
    }
    
    public void calculate()
    {
        int total = m1+m2;
        System.out.println("Total:"+total);
    }

    void display()
    {
        System.out.println("Roll No:"+roll_no);
        System.out.println("Name:"+name);
        System.out.println("Marks 1:"+m1);
        System.out.println("Marks 2:"+m2);
        calculate();
    }
}

class Inter2
{
    public static void main(String a[])
    {
        Result r = new Result(10, "Abc", 89, 95);
        r.display();
    }
}