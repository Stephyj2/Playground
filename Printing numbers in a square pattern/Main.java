#include <stdio.h>
int main()
{
	int i,j,row;
    scanf("%d",&row);
   for(i=1;i<=row;i++)
     {
        for(j=1;j<=row;j++)
         {
          printf("%d",i);
         }
        printf("\n");
      }
  	return 0;
}
