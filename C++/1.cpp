/*Write a program to declare a class ‘Employee’ having data members as emp_id, 
designation, salary. Accept and display this data for 7 employees.*/ 

#include<iostream>
using namespace std;

class Employee
{
    int emp_id;
    string desg;
    float salary;

    public:
            void accept()
            {
                cout<<"\nEnter Employee Id:";
                cin>>emp_id;
                cout<<"\nEnter Designation:";
                cin>>desg;
                cout<<"\nEnter Salary:";
                cin>>salary;
            }
            void display()
            {
                cout<<"\nEmployee Id:"<<emp_id;
                cout<<"\nDesignation:"<<desg;
                cout<<"\nSalary:"<<salary;
            }
};

int main()
{
    Employee E[7];

    cout<<"\n-----Enter Details-----";
    for(int i=0;i<7;i++)
    {
        cout<<"\nEnter Details of Employee"<<i+1;
        E->accept();
    }

    cout<<"\n-----Details-----";
    for(int i=0;i<7;i++)
    {
        cout<<"\nDetails of Employee"<<i+1;
        E->display();
    }
    return 0;
}
