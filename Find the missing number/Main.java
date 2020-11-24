#include<stdio.h>
int main()
{
  int n,a[20],i;
  scanf("%d\n",&n);
  for(int i=1;i<=n;i++)
  {
  	scanf("%d/n",&a[i]);
  }
   for(i=1;i<n;i++)
   {
     if(i!=a[i])
     {
      printf("%d",i);
     }
   }
  return 0;
}