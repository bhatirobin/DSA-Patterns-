import java.util.*;
public class prime3 {
    public static int rprime(int n)
    {
      /*     boolean aprime = true;
        for(int i=2;i<=n-1;i++)
        {
            if(n%i==0)
            {
                return false;
                break;
            }
        }
        return true;*/
        boolean isprime = true;
        for(int i=0;i<=Math.sqrt(n);i++)
        {
          if(n%i==0)
          {
              return false;
          }
        }
        return  true;
    }
    public static void primerange(int n)
    {
        for(int i=2;i<=n;i++)
        {
            if(prime(i))
            {
                System.out.println(i+" ");
            }
        }
        System.out.println();
    }
    public static void main(String args[]) {
        System.out.println(rprime(16));
        
    }
    
}
