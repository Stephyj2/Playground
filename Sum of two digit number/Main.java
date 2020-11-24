import java.util.Scanner;
class Main {
	public static void main (String[] args) {
      Scanner in = new Scanner(System.in);
      int n1 = in.nextInt();
      int p=n1/10;
      int f=n1%10;
      int sum =p+f;
     System.out.println(sum); 
      
	}
}