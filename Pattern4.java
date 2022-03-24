import java.util.Scanner;
class Pattern4
{
	public static void main(String []args)
	{
		Scanner r= new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int row = r.nextInt();
		int r1=0;
		
		for(int i=0;i<=row;i++)
		{
			for(int j=row;j>i;j--)
			{
				System.out.print("  ");
			}
			while(r1!=(2*i+1))
			{
				System.out.print("*" + " ");
				r1++;
			}
			r1=0;
			System.out.println();
			
		}
	}
}