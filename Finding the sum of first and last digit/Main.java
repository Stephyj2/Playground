#include <stdio.h>
int main() {
	int n,r,sum;
   scanf("%d",&n);
   r=n;
   while(n>=100)
   {
     n=n/10;
     
   }
  n=n/10;
   
   r=r%10;
  sum = n+r;
  printf("%d",sum); 
   
	return 0;
}