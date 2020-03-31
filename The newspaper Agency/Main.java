#include<iostream>
using namespace std;
int main()
{
  int w,x,y;
  std::cin>>w>>x>>y;
  int profit = (w*x)-(y*w+100);
  std::cout<<profit;
  return 0;
}