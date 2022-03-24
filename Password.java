import java.util.Scanner;
class Password
{
	public static void main(String[]args)
	{
		Scanner r=new Scanner(System.in);
		System.out.println("Enter the Password : ");
		int password=r.nextInt();
		if(password==1234)
		{
			System.out.println("Hello Roshan !!!");
			
		}
		else
		{
			System.out.println("Please Enter Valid Password.");
		}
	}
}