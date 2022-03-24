import java.util.Scanner;
class Method4
{
	public static void main(String [] args)
	{
		Scanner r=new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int num = r.nextInt();
		reverse(num);
	}
	public static void reverse(int num)
	{
		int count =0;
		int reverse=0;
		while(num !=0)
		{
			int a =num%10;
			count++;
		}
		System.out.println(count);
	}
}