import java.util.*;
public class halfpower 
{

    public static int halfpower(int z, int n)
    {
        if(n==0)
        {
            return 1 ;
        }
        int half = halfpower(z, n/2) * halfpower(z, n/2);

        if(n%2 != 0)
        {
            half = z*half;
        }
        return half;
}
 public static void main(String args[])
         
            {
                Scanner dc = new Scanner(System.in);
                int z = dc.nextInt();
                int n = dc.nextInt();
                  System.out.println(halfpower(z,n));
            }
 
}
