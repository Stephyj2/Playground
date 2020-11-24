#include<stdio.h>
int prime(int num)
{
   int i=1,count=0;
    while(i<=num)
    {
        if(num%i==0)
        {
           count++; 
        }
      i++;
    }
  if(count==2)
  {
    return 1;
  }
}
int main()
{
    int n,c;
    scanf("%d",&n);
  for(int i=2;i<=n;i++)
  {
    c = prime(i);
     if(c==1)
     {
       printf("%d\n",i);
     }
  }
 return 0;
}