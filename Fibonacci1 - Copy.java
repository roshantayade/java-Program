import java.util.Scanner;
class Fibonacci1
{
	public static boolean fiboNum(int num)
	{
		int first=0,second=1,third=0;
		while(third<num)
		{
			third=first+second;
			first=second;
			second=third;
			
		}
		if(third==num)
		{
			return true;
		}
		return false;
	}
	public static void main(String[]args)
	{
		Scanner r=new Scanner(System.in);
		System.out.println("Enter the First Number: ");
		int num1 =r.nextInt();
		System.out.println("Enter the Second Number: ");
		int num2 = r.nextInt();
		int sum=0;
		System.out.println("________________________________");
		
		for(int i=num1;i<=num2;i++)
		{
			if(fiboNum(i))
			{
				sum=sum+i;
				System.out.println(i);
			}
		}
		System.out.println("________________________________");
		System.out.println(sum + "  --> Sum of Fibonacci Number.");
	}
}