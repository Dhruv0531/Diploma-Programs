interface Salary
{
    double basic_salary = 50000;
    void basic_salary();
}

class Employee
{
    int age;
    String name;

    Employee(int a, String nm)
    {
        age=a;
        name=nm;
    }

    void display()
    {
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
    }
}

class Gross_Salary extends Employee implements Salary
{
    double  TA,DA,HRA;

    Gross_Salary(int a, String nm, double ta, double da, double hra)
    {
        super(a,nm);
        TA=ta;
        DA=da;
        HRA=hra;
    }
    public void basic_salary()
    {
        System.out.println("Basic Salary:"+basic_salary);
    }

    void total_sal()
    {
        display();
        basic_salary();
        System.out.println("TA:"+TA);
        System.out.println("DA:"+DA);
        System.out.println("HRA:"+HRA);
        double total = TA+DA+HRA;
        System.out.println("Total Salary:"+total);
        
    }
}

class Inter3
{
    public static void main(String a[])
    {
        Gross_Salary g = new Gross_Salary(28, "Abc", 5000.52, 4032.45, 2000);
        g.total_sal();
    }
}