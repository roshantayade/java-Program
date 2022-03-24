import java.util.Scanner;
class NeonNumber
{
	public static boolean neon(int num)
	{
		int square=num*num;
		int sum=0;
		for(int i =square;i!=0;i/=10)
		{
			int rem=i%10;
			sum=sum+rem;
			
		}
		if(num==sum)
		{
			return true;
		}
		return false;
	}
	public static void main(String[]args)
	{
		Scanner r=new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int num=r.nextInt();
		if(neon(num))
		{
			System.out.println(num+ " It is Neon Number.");
		}
		else
		{
			System.out.println(num+" It not Neon Number.");
		}
	}
	
}