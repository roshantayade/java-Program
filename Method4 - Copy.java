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
			count++;
			
			reverse=reverse *10+(num%10);
			num=num/10;
		}
		System.out.println("Number of digit in Number is : "+count);
		System.out.println("By reversing the Number we get: "+reverse);
	}
}