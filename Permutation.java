import java.util.Scanner;
class Permutation
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the Total Item in set : ");
		int n = sc.nextInt(); 
		System.out.println("Enter the Item Taken for Permutation : " );
		int r= sc.nextInt();
		double p=permutation(n,r);
		System.out.println(p);
		
		
	}
	public static double permutation(int n,int r)
	{
		long product=1;
		long product2=1;
		for (int i=1;i<=n;i++)
		{
			product=product*i;
		}
		for (int i=1;i<=(n-r);i++)
		{
			product2=product2*i;
			
		}
		double p=product/product2;
		return p;
	}
		
}