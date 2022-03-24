import java.util.Scanner;
class Prime1
{
	public static int primeNumber(int a)
	{
		int i=0;
		for(i=2;i<a;i++)
		{
			if(a%i==0)
			{
				break;
			}
		}
		if(i==a)
		{
			return i;
		}
		else
		{
			return 0;
		}
		
	}
	public static void main(String []args)
	{
		Scanner r=new Scanner(System.in);
		System.out.println("Enter First Number: ");
		int a=r.nextInt();
		System.out.println("Enter Second Number: ");
		int b=r.nextInt();
		for(int i=a;i<=b;i++)
		{
			if(i==primeNumber(i))
			{
				System.out.println(i);
			}
		}
	}
}