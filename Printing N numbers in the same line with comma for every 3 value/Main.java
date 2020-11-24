#include <stdio.h>
int main() 
{
   int n,count;
  scanf("%d",&n);
  for(count=1;count<=n;count++)
  {
      printf("%d",count); 
      if(count%3==0)
      {
        printf(","); 
      }
  }
	return 0;
}