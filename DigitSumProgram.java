import java.util.Scanner;
class DigitSum
{
	public static void main(String[]args)
	{
		Scanner r=new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int num=r.nextInt();
		int sum =0;
		while (num>0)
		{
			int rem=num%10;
			num/=10;
			sum=sum+rem;
		}
		
		System.out.println("The sum of digit of number is : " + sum);
	
	}
}
