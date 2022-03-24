import java.util.Scanner;
class ArmstrongNumber
{
	public static int length(int num)
	{
		int len=0;
		while(num!=0)
		{
			num/=10;
			len++;
		}
		return len;
	}
	public static boolean armStrong(int num)
	{
		int rem,product=1,sum=0;
		int len=length(num);
		int a=num;
		
		while(num!=0)
		{
			rem=num%10;
			while(len!=0)
			{
				product=product*rem;
				len--;
			}
			sum=sum+product;
			product=1;
			num/=10;
		}
		if(sum==a)
		{
			return true;
		}
		return false;
	}
	public static void main(String[]args)
	{
		Scanner r=new Scanner(System.in);
		System.out.println("Eneter the Number: ");
		int num=r.nextInt();
		if(armStrong(num))
		{
			System.out.println("It's armstrong Number.");
		}
		else
		{
			System.out.println("It's not ArmStrong Number.");
		}
	}
}