import java.util.Scanner;
class PrimeNumber
{
	public static void primeNumber(int num1,int num2)
	{
		int count =0;
		int i;
		int a;
		for(i=(num1+1);i<num2;i++)
		{
			for(a=2;a<i;a++)
			{
				if(i%a==0)
				{
					break;
				}
			}
			if(a==i)
			{
				System.out.println((++count)+" "+a);
			
			}
			
		}
		
	}
	public static void main(String[]args)
	{
		
		Scanner r=new Scanner(System.in);
		System.out.println("Enter the Password: ");
		int Password=r.nextInt();
			if(Password==253623)
			{
				System.out.println("Enter Starting Number: ");
				int num1=r.nextInt();
				System.out.println("Enter Last Limit: ");
				int num2=r.nextInt();
				primeNumber(num1,num2);
			}
			else
			{
				System.out.println("Enter valid Password : ");
			}
	}
}