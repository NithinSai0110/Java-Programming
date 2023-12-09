import java.util.*;
class E16Pattern
{
    public static void main(String[] args)
    {
        int i,n,j;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter num:");
        n=s.nextInt();
        for(i=1;i<=n;i++)
        {
            for(j=n-i;j>=1;j--)
            {
                System.out.print(" ");
            }
            for(j=0;j<i;j++)
            {
                System.out.print(" $");
            }
            System.out.println("");
        }
    }
}