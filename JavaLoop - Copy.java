import java.util.Scanner;
class JavaLoop
{
    public static void main(String[]args)
    {
        Scanner r=new Scanner (System.in);
        int q =r.nextInt();
        int i=1;
        while (i <=q)
        {
            int a = r.nextInt();
            int b=r.nextInt();
            int c=r.nextInt();
            int j=0;
            int s=0;
            while(j<c)
            {
                int l= (int)Math.pow(2,j);
                s= a+(l*b)+s;
                System.out.print(s + " ");
                a=0;
                j++;
            }
            System.out.println(" ");
            i++;
        }
        
    }
}
