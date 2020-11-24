#include<stdio.h>
int main()
{
   int n,temp=0,r,c;
   scanf("%d",&n);
   c=n;
   while(n>0)
   {
      r = n%10;
      temp= temp+r*r*r;
      n=n/10;
   }
 if(c==temp)
    printf("Armstrong Number");
 else
   printf("Not an Armstrong Number");

	return 0;
}

