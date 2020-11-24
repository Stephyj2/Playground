#include<stdio.h>
int sum(int num)
{
  int sum=0;
   for(int i=1;i<=num;i++)
   {
     sum=sum+i;
   }
  return sum;
}
int main() 
{
   int n;
   scanf("%d",&n);
   int a = sum(n);
   printf("%d",a);
  	return 0;
}