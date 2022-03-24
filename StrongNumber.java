import java.util.Scanner;
class StrongNumber
{
	public static boolean strongNumber(int num)
	{
		int factorial=1,rem,sum=0;
		
		
		for(int i = num; i!=0;i/=10)
		{
			rem=i%10;
			
			for(int j=1;j<=rem;j++)
			{
				factorial*=j;
			}
			sum=sum+factorial;
			factorial=1;
		}
		
		if(sum==num)
		{
			return true;
		}
		return false;	
	}
	public static void main(String []args)
	{
		Scanner r = new Scanner(System.in);
		
		System.out.println("Enter the Number: ");
		int num1 = r.nextInt();
		System.out.println("Enter the Second Number: ");
		int num2 = r.nextInt();
		
		for(int i=num1;i<=num2;i++)
		{
			if(strongNumber(i))
			{
				System.out.println(i+ "==> It is a Strong Number");
			}
			else
			{
				System.out.println(i+ "==> Its not Strong Number.");
			}
		}
	}
}