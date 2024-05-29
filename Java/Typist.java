class Person
{
    int age;
    String name;

    Person(String nm, int a)
    {
        name=nm;
        age=a;
    }
    void display()
    {
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
    }
}

class Teacher extends Person
{
    int id;

    Teacher(String nm, int a, int i)
    {
        super(nm,a);
        id=i;
    }
    void show()
    {
        super.display();
        System.out.println("Id:"+id);
    }
}

class Typist extends Person
{
    int speed;
    Typist(String nm, int a, int s)
    {
        super(nm,a);
        speed=s;
    }
    void show()
    {
        System.out.println("Speed:"+speed);
    }
    public static void main(String args[])
    {
        Typist t = new Typist("Abc",17,120);
        t.show();
        Teacher t1 = new Teacher("Abc",17,100);
        t1.show();
    }
}