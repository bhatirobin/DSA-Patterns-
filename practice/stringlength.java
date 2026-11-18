import java.util.*;
public class stringlength 
{
 /*    public static String rv(String n)
    {
                for(int i = 0; i<n.length(); i++)
                {
                    System.out.println(n.charAt(i));
                }
                return n.charAT(i);
    }*/
    public static int length(String n)
    {
        if(n.length() == 0)
        {
            return n.length();
        }
        return length(n.substring(1));
    }
 public static void main(String[] args)
 {
        Scanner sc = new Scanner(System.in);

        String n ="robin";
        System.out.println(length(n));
 }
    
}
