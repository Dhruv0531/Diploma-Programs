#include<iostream>
using namespace std;

class Demo
{
    public:
    void area(int r)
    {
        cout<<"\nArea of Circle:"<<3.14*r*r;
    }
    void area(float b, float h)
    {
        cout<<"\nArea of Triangle:"<<1.2*b*h;
    }
    void area(int l, int b)
    {
        cout<<"\nArea of Rectangle:"<<l*b;
    }
};

int main()
{
    Demo D;

    D.area(3);
    D.area(6.3F,2.1F);
    D.area(4,7);

    return 0;
}