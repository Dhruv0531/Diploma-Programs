class Person
{
    String name;
    int age;

    Person(String nm, int a)
    {
        name = nm;
        age = a;
    }
    void display()
    {
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
    }
}

class Employee extends Person
{
   int empid;
   float salary;

   Employee(String nm, int a, int ei, float s)
   {
    super(nm,a);
    empid = ei;
    salary = s;
   }
   void display()
   {
    super.display();
    System.out.println("EmpID:"+empid);
    System.out.println("Salary:"+salary);
   }
}
class Manager extends Employee
{
    String designation;

    Manager(String nm, int a, int ei, float s, String des)
    {
       super(nm,a,ei,s);
       designation = des;
    }
    void display()
    {
        super.display();
        System.out.println("Designation:"+designation);
    }
}

class InDemo
{
    public static void main(String args[])
    {
        Manager m = new Manager("Dhruv",17,52,120000f,"CEO");
        m.display();
    }
}