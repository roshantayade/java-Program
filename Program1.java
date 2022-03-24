import java.util.Scanner;
class Program1
{
	public static void main(String[]args)
	{
		Scanner r=new Scanner(System.in);
		System.out.println("Enter the Value : ");
		int value=r.nextInt();
		if(value%10==7 && value>=100 && value <=200)
		{
			System.out.println(value);
		}
		else
		{
			System.out.println("please provide valid input");
		}
	}
}
