import java.util.Scanner;
class PrimeSum
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
		if(i==a)
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
	public static void main(String[]args)
	{
		Scanner r=new Scanner(System.in);
		System.out.println("Enter the first Number: "); 
		int a=r.nextInt();
		System.out.println("Enter the second Number: ");
		int b=r.nextInt();
		int sum=0;
		for(int i=a;i<=b;i++)
		{
			if(prime(i))
			{
				sum=sum+i;
			}
		}
		System.out.println("The sum of prime number is "+ sum);
	}
}