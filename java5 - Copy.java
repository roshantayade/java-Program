import java.util.Scanner;
class java5
{
	public static void main(String[]args)
	{
		Scanner r=new Scanner(System.in);
		
		String s=r.nextLine();
		String output="";
		
		if(s.length() % 2 !=0)
		{
			for (int i = 0; i<s.length()-2;i++)
			{
				if(s.charAt(i) > s.charAt(i+1))
				{
					output=output+s.charAt(i);
				}
				else
				{
					output=output+s.charAt(i+1);
				}
				i++;
			}
			output=output+s.charAt(s.length()-1);
		}
		System.out.println(output);
		
	}
}