import java.util.*;
class E1Reverse
{
    public static void main(String[] args)
    {
        int i;
        String str,rev="";
        System.out.println("Enter String:");
        Scanner s=new Scanner(System.in);
        str=s.nextLine();
        for(i=str.length()-1;i>=0;i--)
        {
            rev=rev+str.charAt(i);
        }
        System.out.println(rev);
    }
}