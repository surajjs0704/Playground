#include<iostream>
using namespace std;
int main()
{
  int a,d;
  float b;
  double c;
  a=sizeof(char);
  b=sizeof(int);
  c=(int)sizeof(float);
  d=(int)sizeof(double);
  cout<<a<<"\n"<<b<<"\n"<<c<<"\n"<<d;
}