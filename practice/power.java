import java.util.*;
public class power 
{
    public static int power(int p,int n )
    {
        if(p == 0)
        {
            return 1;
        }
        return n * power(p-1, n);

    }
    public static void main(String args[])
    {
           System.out.println("the n power value is this :-" +" "+ power(5,2 ));
    }
    
}
