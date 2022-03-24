import java.util.Scanner;
class roshan
{ 
public static void main(String [] args)
{
	Scanner r =new Scanner(System.in);
	
	int input = r.nextInt();
	int count=0;

	while(input !=0)
	{
		int cube =r.nextInt();
		int j;
		for(int i=1;i<cube/2;i++)
		{
			j=i*i*i;
			if(j==cube)
			{
				count++;
			}
		}
		input--;
		
	}
	System.out.println("count");

}
	
}