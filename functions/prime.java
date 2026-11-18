import java.util.*;
public class prime {
    public static boolean nprime(int n)
    {
        boolean isprime = true;
        for(int i=2;i<=n-1;i++)
        {
            if(n%i==0)
            {
                isprime = false;
                //jha pr bhi ek baar condition false ho gyi loop fir vhi se exit le lega 
                //iske niche break bhi kr skte ho ye ek 
                   break;
            }
        }
            return isprime;
    }
public static void main(String args[]) {
    System.out.println(nprime(11));
    
}    
}
