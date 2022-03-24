import java.util.Scanner;
class PrimeEvenOdd
{
	public static boolean prime(int i)
	{
		int a;
		for(a=2;a<i;a++)
		{
			if(i%a==0)
			{
				break;
			}
		}
		boolean result=(a==i? true:false);
		return result;
	}
	public static String evenOdd(int i)
	{
		String result=(i%2==0? "Even" : "Odd");
		return result;
	}
	public static void main(String[]args)
	{
		Scanner r=new Scanner (System.in);
		System.out.println("Enter the First Number: ");
		int a=r.nextInt ();
		System.out.println("Enter Second Number: ");
		int b=r.nextInt();
		for(int i=a;i<=b;i++)
		{
			if(prime (i))
			{
				System.out.println("Prime Number "+ i + " is "+evenOdd(i));
			}
		}
		
	}
}