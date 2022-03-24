import java.util.Scanner;
class Pattern7
{
	public static void main(String[]args)
	{
		Scanner r= new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int row=r.nextInt();
		int k=0,v=1;
		int j,m=0;
		
		for(int i=0;i<row;i++)
		{
			for( j =row;j>i;j--)
			{
				m++;
				System.out.print(" ");
			}
			while(k!=2*i+1)
			{
				
				if(k==0 || k==j+1 )
				{
					System.out.print(v+ " ");
				}
				else
				{
					v=v*(i-m+1)/m;
					System.out.print(v+" "); 
				}
				
				k++;
			}
			m=0;
			k=0;
			System.out.println();
		
		}
	}
}