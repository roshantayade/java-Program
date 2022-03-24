import java.util.Scanner;
class Fibo
{
	public static boolean findFibo(int i)
	{
		int start=0,second=1,third=0;
		while(third<i)
		{
			third=start+second;
			start=second;
			second=third;
			
		}
		if(i==third)
		{
			return true;
		}
		return false;
	}
	public static void main(String []args)
	{
		Scanner r=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num=r.nextInt();
		if(findFibo(num))
		{
			System.out.println("Number is Fobonacci Number.");
		}
		else 
		{
			System.out.println("Number is not Fibonacci Number.");
		}
	}
}