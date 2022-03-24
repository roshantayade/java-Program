import java.util.Scanner;
class DeciamalUptoTwoNum
{
	public static void main(String[] args) 
	{
		Scanner r = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		double num = r.nextDouble();
		double num1= num*100;
		double num2 = (int)num1;
		double num3= num2/100;

		System.out.println(num3);
	}
}