#include<iostream>
using namespace std;
int main()
{
  int p,r,t;
  float a,i,d=0.2,final_settlement;
  cin>>p>>r>>t;
  i=(p*r*t)/100;
  a=p+i;
  d=(i*2)/100;
  final_settlement=a-d;
  cout<<i<<"\n"<<a<<"\n"<<d<<"\n"<<final_settlement;
  
  return 0;
  
}