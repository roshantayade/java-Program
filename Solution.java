import java.util.Scanner;
class Solution
{
    public static void main(String[]args)
	{
        Scanner r=new Scanner(System.in);
        int i=1;
		int a=r.nextInt();
		int d=a;
        while(i<=10)
        {    
            a=d*i;
            System.out.println(d +" x "+ i + " = "+a);
            i++; 
		}
	}
}	