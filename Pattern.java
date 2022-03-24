class Pattern
{
	public static void main(String[]args)
	{
		for(int i=0;i<18;i++)
		{
			for(int j=0;j<9;j++)
			{
				if(j==0 && (i<18))
				{
					System.out.print("A ");
				}
				else if(j==1 && (i<=7 || i>9))
				{
					System.out.print("B ");
					
				}
				else if(j==2 && (i<=6 || i>10))
				{
					System.out.print("C ");
				}
				else if(j==3 && (i<=5 || i>11))
				{
					System.out.print("D ");
				}
				else if(j==4 && (i<=4 || i>12))
				{
					System.out.print("E ");
				}
				else if (j==5 && (i<=3 || i>13))
				{
					System.out.print("F ");
				}
				else if (j==6 && (i<=2 || i>14))
				{
					System.out.print("G ");
				}
				else if (j==7 && (i<=1 || i> 15))
				{
					System.out.print("H ");
				}
				else if (j==8 && (i<=0 || i > 16))
				{
					System.out.print("I ");
				}
				else 
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}