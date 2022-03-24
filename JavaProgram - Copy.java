import java.util.Scanner;
class Solution
{
    public static void main(String[]args)
    {
        Scanner r= new Scanner(System.in);
        int n=r.nextInt();
        int i=1;
        while(i<=n)
        {
            long a=r.nextLong();
            if(a>(-128)& a<127)
            {
                System.out.println((byte)a+" can be fitted in:\n* byte \n* short\n* int\n* long");
            }
            else if(a>(-32768) & a<32767)
            {
                System.out.println((int)a+" can be fitted in:\n* short\n* int\n* long");
            }
            else if( a>(-2147483648) & a<2147483647)
            {
                System.out.println((int)a+" can be fitted in:\n* int\n* long");
            }
            else if( a>=(Math.pow(-2,63))& a<=(Math.pow(2,63)))
            {
               System.out.println((long)a+" can be fitted in:\n* long");
            }
            else
            {
              System.out.println(a+ " can't be fitted anywhere.");
            }
            i++;
        }
    }
}