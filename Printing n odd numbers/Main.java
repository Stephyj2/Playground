#include <stdio.h>
int main()
{
   int n=0,i,num;
   scanf("%d",&num);
   for(i=0;i<=(2*num);i++)
   {
     if(n%2!=0)
       printf("%d\n",n);
       n++;
   }
  return 0;
}
  