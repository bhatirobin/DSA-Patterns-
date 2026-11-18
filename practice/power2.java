import java.util.*;
public class power2 
{
    public static int power(int s, int t)
    {
        if(t == 0)
        {
            return 1;
        }
        int p = power(s, t-1) * s  ;
        return p;
    }
    public static void main(String args[])
    {
        System.out.println(power(2, 10));
    }
    
}
