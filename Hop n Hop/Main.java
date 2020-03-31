#include<iostream>
#include<math.h>
using namespace std;
int main()
{
  int a,b,x,y,c,e,d;
  cin>>x>>y;
  a=3;
  b=4;
  c=pow((x-a),2);
  e=pow((y-b),2);
  d=pow((c+e),0.5);
  cout<<d;
  return 0;
}