import java.util.Scanner;
class Palindrome
{
	public static void main(String [] args)
	{
		Scanner r= new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num = r.nextInt();
		System.out.println(palindrome(num));
	}
	public static String palindrome(int num)
	{
		int reverse=0,a=num;
		while(a!=0)
		{
			reverse=reverse*10+(a%10);
			a=a/10;	
		}
		String result=(num==reverse)? "It is Palindrome Number.":"It not Palindrome Number." ;
		return result;
	}
}