import java.util.*;
public class gcd 
{
    public static int gcd1(int x, int y)
    {
        if(x%y != 0)
        {
            return 0;
        }
        int temp = x%y;
        x = y;
        y = temp;
        return temp;        
    }
    public static void main(String args[])
    {
      System.out.println(gcd1(12, 16));
    }    
}
