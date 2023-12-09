import java.util.*;
class as2
{
    String str1,str2;
    void m()
    {

        Scanner in=new Scanner(System.in);
        System.out.println("Enter user name:");
        str1=in.nextLine();
        System.out.println("renter user name:");
        str2=in.nextLine();
    }
    void cals()
    {
        if (str1.equals(str2))
            System.out.println("user name is valid");
        else
            System.out.println("invalid user name");
    }
    public static void main(String args[])
    {
        as2 o=new as2();
        o.m();
        o.cals();
    }
}