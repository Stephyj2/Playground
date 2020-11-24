import java.util.Scanner;
class Main{
public static void main(String args[])
{
  Scanner in = new Scanner(System.in);
    int base = in.nextInt();
  	int exponent = in.nextInt();
    System.out.println(power(base,exponent));
}
public static int power (int b, int e)
{
 int res = 1;
  while(e>0)
  {
      res = res * b;
      e--; 
   }
   //System.out.println(res);
   return res;
}
}
