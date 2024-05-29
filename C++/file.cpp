#include<iostream>
#include<fstream>
using namespace std;
int main()
{
    ifstream ifs;
    ofstream ofs;
    char ch;

    ofs.open("demo.txt",ios::out);
    ofs<<"Welcome to Poly";
    ofs.close();

    ifs.open("demo.txt",ios::in);
    while(!ifs.eof())
    {
        ifs.get(ch);
        cout<<ch;
    }
    return 0;


}