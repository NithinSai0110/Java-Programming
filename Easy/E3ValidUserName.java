import java.util.*;
class E3ValidUserName
{
    public static void main(String args[])
    {
        String in,out;
        Scanner s= new Scanner(System.in);
        System.out.println("Enter Your User Name:");
        in="Nithin0110";
        out=s.nextLine();
        if(in.compareTo(out)==0)
        {
            System.out.println("The entered Username is vaild");
        }
        else {
            System.out.println("User Name Invalid");
        }
    }
}