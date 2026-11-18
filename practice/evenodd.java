import java.util.*;
public class evenodd 
{
    public static int power(int p, int q)
    {
        if(q == 0)
        {
            return 1;
        }
        int small = power(p, q/2);
        // this  condition is even condition
        if(q%2 == 0)
        {
            return small*small;
        }
        //this condition is a odd calculate
        else{
            return p * small * small;
        }
    }
    public static void main(String args[])
    {
        System.out.println(power(2, 5));

    }
    
}
