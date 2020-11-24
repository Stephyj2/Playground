#include<stdio.h>
#include<string.h>
int main()
{
  int i,j,len,flag=0;
  char str[10];
  gets(str);
  len=strlen(str);
  j=len-1;
  for(i=0;i<len;i++)
  {
    if(str[i]==str[j])
    {
    	j--;
    }
    else
    {
      flag=1;
    }
  }
if(flag==1)
{
  printf("%s is not a palindrome");
}
else
{
	printf("%s is a palindrome");
}
  return 0;
}