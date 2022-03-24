import java.util.Scanner;
class Method
{
	public static void main (String [] args)
	{
		Scanner r = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num=r.nextInt();
		evenOdd(num);
		
	}
	public static void evenOdd(int a)
	{
		String b= a%2==0 ? "Number is Even." : "Number is odd.";
		System.out.println((a) + " "+b);
	}
}