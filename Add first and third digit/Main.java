import java.util.Scanner;
class Main{
	public static void main (String[] args) {
	Scanner in = new Scanner(System.in);
    int n1 = in.nextInt();	
    int p= n1%10;//3rd digit
    int s=n1/100;
    int sum =p+s;
    System.out.println(sum); 
      
      
      
	}
}