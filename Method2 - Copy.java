import java.util.Scanner;
class Method2
{
	public static void main(String[]args)
	{
		Scanner r = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num = r.nextInt();
		factorial(num);
		
	}
	public static void factorial(long num)
	{
		long a=num;
		long factorial=1;
		while(num!=0)
		{
			factorial=factorial*num;
			num--;
		}
		System.out.println("Factorial of the number "+a+" is "+factorial);
	}
}