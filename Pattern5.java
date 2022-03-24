import java.util.Scanner;
class Pattern5
{
	public static void main(String[]args)
	{
		Scanner r = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int row=r.nextInt();
		int k=0,v=1;
		
		for(int i=0;i<row;i++)
		{
			for(int j=row;j>i;j--)
			{
				System.out.print("  ");
			}
			while(k!=(2*i+1))
			{	
				if(k<=i)
				{
					System.out.print(v++ + " ");
				}
				else
				{
					System.out.print(--v -1  + " ");
				}
				k++;
			}
			k=0;
			System.out.println();
		}
	}
}