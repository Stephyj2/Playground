#include <stdio.h>
void grt(int n1,int n2,int n3)
{
   if(n1>n2)
   {
      if(n3>n1)
      {
        printf("%d",n3);
      }
      else
      {
         printf("%d",n1);
      }
   }
  else
  {
      if(n3>n2)
      {
        printf("%d",n3);
      }
      else
      {
         printf("%d",n2);
      }
  }
}
int main()
{
	int n1,n2,n3;
    scanf("%d%d%d",&n1,&n2,&n3);
    grt(n1,n2,n3);
  	return 0;
}