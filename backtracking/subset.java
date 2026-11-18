import java.util.*;
public class subset
{

    public static void subset(String str, String ans, int i)
        {
            if(i == str.length())
            {
                System.out.print(ans+" ");
                return;
            }
            subset(str, ans+str.charAt(i), i+1);

            subset(str, ans, i+1);
        }
    public static void main(String args[])
    {
        String str ="abcd";

        subset(str, " ", 0);
    }
}
