interface Sports
{
    int sportwt = 5;
    void putdata();
}

class Student
{
    int roll_no;
    String name;

    Student(int rn, String nm)
    {
        roll_no=rn;
        name=nm;
    }
}

class Mark extends Student implements Sports
{
    int m1,m2;
    Mark(int rn, String nm, int x, int y)
    {
        super(rn,nm);
        m1=x;
        m2=y;
    }
    void show()
    {
        System.out.println("Roll No:"+roll_no);
        System.out.println("Name:"+name);
        System.out.println("Marks 1:"+m1);
        System.out.println("Marks 2:"+m2);
    }
    public void putdata()
    {
        System.out.println("Sport wt:"+sportwt);
    }
}

class Inter1
{
    public static void main(String args[])
    {
        Mark m = new Mark(10,"ABC",80,95);
        m.show();
        m.putdata();

    }
}