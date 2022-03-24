import java.util.Scanner;
class HappyNumber
{
	public static boolean happyNumber(int num)
	{
		int rem,square=0,sum=0;
		
		for(int i = num;i>1;i=sum)
		{
			sum=0;
			for(int j=i;j!=0;j/=10)
			{
				rem=j%10;
				square=rem*rem;
				sum=sum+square;
				square=0;
			}
		
		}
		if(sum==1)
		{
			return true;
		}
		return false;
	}
	public static void main(String [] args)
	{
		Scanner r = new Scanner(System.in);
		System.out.println("Enter First Number: ");
		int num1=r.nextInt();
		System.out.println("Enter Second Number: ");
		int num2=r.nextInt();
		System.out.println("==> Happy Numbers <==");
		int j=0;
		for(int i=num1;i<=num2;i++)
		{
			
			
			if(happyNumber(i))
			{
				
				System.out.println(++j+"\t"+i+"\t");
			}
			else
			{
				//System.out.println(i+"==> Sad Number.");
			}
		}
	}
}