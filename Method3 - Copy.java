import java.util.Scanner;
class Method3
{
	public static void main(String [] args)
	{
		Scanner r=new Scanner(System.in);
		System.out.println("Enter First number : ");
		int num1=r.nextInt();
		System.out.println("Enter Second Number : ");
		int num2=r.nextInt();
		num(num1,num2);
		
	}
	public static void num(int num1 , int num2)
	{
		while(num1<=num2)
		{
			if(num1%3==0)
			{
				System.out.println(num1+" the number is divisible by 3.");
			}
			num1++;
		}
	}
}