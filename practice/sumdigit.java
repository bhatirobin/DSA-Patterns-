import java.util.*;
public class sumdigit 
{
    public static int sumd(int n)
    {
        if(n>=0 && n<=10)
        {
            return n;
        }
        int n1 = sumd(n/10);
        int n2 = sumd(n1%10);
        return n1+n2;
    }
    public static void main(String args[])
    {
        System.err.println(sumd(1234));

    }    
}
