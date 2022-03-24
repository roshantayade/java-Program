class Pattern3
{
	public static void main(String[]args)
	{
		for(int i =0;i<7;i++)
		{
			for(int j=0;j<5;j++)
			{
				if( j==0 || (i==3 && (j== 1 ||j==2||j==3)) || (i==0 &&(j==1||j==2||j==3)) || (j==4 && (i==1||i==2||i==4||i==5||i==6)))
				{
					System.out.print("* ");	
				}
				else
				{
					System.out.print("  ");	
				}
				i
					
			}
			System.out.println();
		}
	}
}