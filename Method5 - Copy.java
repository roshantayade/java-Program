import java.util.Scanner;
class Method5
{
	public static long charProduct(int a, int b)
	{
		long product=1;
		for (long i = a ; i<=b; i++)
		{
			product= product*i;
		}
		return product;
	}
	public static int count1(long a)
	{
		int count =0;
		for(long i=a;i!=0;i/=10)
		{
			long rem=i%10;
			if(rem==1)
			{
				count++;
			}
		}
		return count;
	}
	public static boolean prime(int a)
	{
		int i;
		for(i=2;i<a;i++)
		{
			if(a%i==0)
			{
				break;
			}
		}
		if(i==a)
		{
			return true;
		}
		return false;
	}
	public static void main(String [] args)
	{
		Scanner r =new Scanner(System.in);
		System.out.println("Enter the First Charactor: ");
		char a=r.next().charAt(0);
		System.out.println("Enter the Second Charactor : ");
		char b=r.next().charAt(0);
		int productCount=count1(charProduct(a,b));
		if(prime(productCount))
		{
			System.out.println(productCount+" is prime Number.");
		}
	}
	
}