//parameters overloading
import java.util.*;
public class function7 
{
    public static int sum(int a, int b)
    {
        System.out.println(a+b);

        return a+b;
    }

    public static int sum(int a, int b, int c)
    {
        System.out.println(a+b+c);

        return a+b+c;

    }
    public static int sum(int a, int b, int c, int d)
    {
        System.out.println(a+b+c+d);

        return a+b+c+d;
    }
    public static void main(String[] args) 
    {
        sum(4, 64);
        sum(6, 64, 3);
        sum(4, 6, 8, 7);
        
    }
    
}
