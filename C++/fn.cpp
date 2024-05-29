#include<iostream>
using namespace std;

class Demo
{
    public:
    void swap(int a, int b)
    {
        cout<<"\nValues before swap:  "<<"a:"<<a<<"\tb:"<<b;
        int temp=a;
        a=b;
        b=temp;
        cout<<"\nValues after swap:   "<<"a:"<<a<<"\tb:"<<b;
    }
    void swap(float a, float b)
    {
        
        cout<<"\nValues before swap:  "<<"a:"<<a<<"\tb:"<<b;
        float temp=a;
        a=b;
        b=temp;
        cout<<"\nValues after swap:   "<<"a:"<<a<<"\tb:"<<b;
    }
};

int main()
{
    Demo D;

    D.swap(10,20);
    D.swap(12.6F,20.56F);
    return 0;

}