// INCLUDE HEADER FILES NEEDED BY YOUR PROGRAM
// SOME LIBRARY FUNCTIONALITY MAY BE RESTRICTED
// DEFINE ANY FUNCTION NEEDED
// FUNCTION SIGNATURE BEGINS, THIS FUNCTION IS REQUIRED
#include <stdio.h>
// Main function
int main()
{
 int n,i,c;
  scanf("%d\n",&n);
  int a[n];
  for(i=0;i<=n-1;i++)
  {
  	 scanf("%d",&a[i]);
  }
  int max=a[0];
  for(i=0;i<=n-1;i++)
  {
  		if(max<a[i])
        {
           max=a[i];
           c=i;
        }
  }
  printf("%d",c);
  
   return 0;
}


