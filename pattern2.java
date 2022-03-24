class Pattern2
{
	public static void main(String[]args)
	{
		int a=65;
		for(int i=0;i<18;i++)
		{
			
			for(int j=i;j<9;j++)
			{
				char b=(char)a;
				System.out.print(b+" ");	
				a++;
			}
			for(int j=i; (j >8 && j<18);j--)
			{
				char b=(char)a;
				System.out.print(b+" ");	
				a++;
			}
			a=65;
			System.out.println();
		}
	}
}