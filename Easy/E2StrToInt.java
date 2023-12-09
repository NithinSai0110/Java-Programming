import java.util.*;
class E2StrToInt
{
    public static void main(String args[])
    {
        try
        {
            Scanner s=new Scanner(System.in);
            System.out.println("Enter the String of numbers:");
            String str=s.nextLine();
            int n=Integer.parseInt(str);
            System.out.println("Converted num is:"+n);
        }
        catch (NumberFormatException e)
        {
            System.out.println("Invalid Input of Srting");
        }
    }
}