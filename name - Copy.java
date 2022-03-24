import java.util.Scanner;
class Ad
{
	public static void main(String[]args)
	{
		Scanner r= new Scanner(System.in);
		System.out.println("Enter the value : ");
		int a = r.nextInt();
		System.out.println("enter the second value");
		int b =r.nextInt();
		int s= a+b;
		int p=1;
		System.out.println("the result is: " + (s+p));
		
		System.out.println(s+1 );
	}
}