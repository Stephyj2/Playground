#include <stdio.h>
int gcd(int n1,int n2)
{
  int min;
     
      if(n2>n1)
      {
        min=n1;
      }
     else
     {
        min=n2;
     }
  while(min>=1)
  {
     if(n1%min==0 && n2%min==0)
     {
        return min;
     }
       min--;
  }
}
int main()
{
	int n1,n2,n3;
    scanf("%d%d%d",&n1,&n2,&n3);
    int c = gcd(n1,n2);
    int r= gcd(c,n3);
    printf("%d",r);
	return 0;
}