#include<stdio.h>
int square(int num)
{
   int sq=num*num;
   return sq;
}
int main()
{
   int n;
   scanf("%d",&n);
   int a = square(n);
   printf("%d",a);
   return 0;
}