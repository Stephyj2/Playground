#include<stdio.h>
int main()
{
  int arr_size,search_elem_1,search_elem_2,f,fi;
  scanf("%d\n",&arr_size);
  int arr[arr_size];
  for(int i=0;i<=arr_size-1;i++)
  {
  	scanf("%d",&arr[i]);
  }
 scanf("\n%d\n",&search_elem_1);
 scanf("%d",&search_elem_2);
for(int i=0;i<=arr_size-1;i++)
  {
  	 if(search_elem_1==arr[i])
        {
            f=i;
            break;
        }
     else
        {
        	 f=-1;
            
        }
  } 
 printf("%d\n",f);
for(int i=0;i<=arr_size-1;i++)
  {
  	 if(search_elem_2==arr[i])
        {
            fi=i;
            break;
        }
     else
        {
        	fi=-1;
            
        }
  } 
printf("%d",fi);
  return 0;
}