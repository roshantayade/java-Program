import java.util.Scanner;

public class Strong 
{
	public static void main(String[] args) 
	{
		Scanner r= new Scanner(System.in);
		int num = r.nextInt();
		int sum=0;
		
		for(int i = num;i!=0;i/=10)
		{
			int rem=i%10;
			sum=sum+fact(rem);
			
		}
		if(num==sum)
		{
			System.out.println(num);
		}
		
	}
	public static int fact(int num)
	{
		int factorial=1;
		for(int i = num ;i!=0;i--)
		{
			factorial=factorial*i;
		}
		return factorial;
	}
}