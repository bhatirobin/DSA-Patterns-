import java.util.*;
public class halfpower 
{
    public static int power(int n, int p)
    {
        if(p == 0)
        {
            return 1;
        }
        int half = power(n, p/2) ;

        if(n%2 == 0)
        {
           n = n*half;
        }
        return n;
    
    }
    public static void main(String args[])
    {
        System.out.println(power(2, 5));  



    }
    
}
