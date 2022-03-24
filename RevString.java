import java.util.Scanner;
class RevString
{
	public static void main (String [] args)
	{
		Scanner r= new Scanner(System.in);
		System.out.println("Enter the String: ");
		String s1 =r.nextLine();
		String rev="";
		for (int i = s1.length()-1;i>=0;i--)
		{
			rev=rev+s1.charAt(i);
		}
		System.out.println(rev);
		
		if(s1.equals(rev))
		{
			System.out.println("String is palindrome.");
		}
		else
		{
			System.out.println("String is not Palindrome.");
		}
	}
}
