#include<iostream>
using namespace std;
int main()
{
  int id,score;
  cin>>id>>score;
  if(score<=10 && score>0)
  {
    cout<<id;
    cout<< " is eligible for reward. ";
  }

}