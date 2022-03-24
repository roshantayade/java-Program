import java.util.Scanner;
class Calculation
{
	public static void main(String []args)
	{
		Scanner r=new Scanner(System.in);
		System.out.println("!!!!!!! Wel-Come to Calculator !!!!!!");
		System.out.println("Enter option as per given Below : ");
		System.out.println("1 : For Find Distance");
		System.out.println("2: For Find Speed");
		System.out.println("3: For Find Time");
		int option=r.nextInt();
		
		switch(option)
		{
			case 1:
			{
				System.out.println("Enter Speed in km/hr : ");
				double speed=r.nextDouble();
				System.out.println("Enter Time in hr : ");
				double time=r.nextDouble();
				System.out.println("Distance = "+(speed*time));
				break;
			}
			case 2:
			{
				System.out.println("Enter Distance in km : ");
				double distance =r.nextDouble();
				System.out.println("Enter Time in hr");
				double time=r.nextDouble();
				System.out.println("Speed = "+(distance/time));
				break;
			}
			case 3:
			{
				System.out.println("Enter Distance in km : ");
				double distance=r.nextDouble();
				System.out.println("Enter Speed in km/hr : ");
				double speed=r.nextDouble();
				System.out.println("Time = "+(distance/speed));
				break;
			}
			default :
			{
				System.out.println("Enter valid Value from 1 to 3");
			}
			
		}
	}
	
	
}
