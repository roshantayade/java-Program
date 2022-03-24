import java.util.Scanner;
class Pattern6
{
	public static void main(String[]args)
	{
		Scanner r=new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int row =r.nextInt();
		int n=0;
		
		for(int i=row;i!=0;i--)
		{
			for(int j=i;j<row;j++)
			{
				System.out.print("  ");
			}
			while(n<(i*2)-1)
			{
				System.out.print(" *");
				n++;
			}
			n=0;
			System.out.println();
		}
	}
}