import java.util.*;
public class prime2 {
    public static boolean nprime (int n)
    {
        if(n==2)
        {
            return true;
        }
      //  boolean aprime = false ;
      for(int i=0;i<=Math.sqrt(n);i++)
      {
        if(n%i==0)
        {
            return false;
        }
      }
      return  true;
    }
    public static void main(String args[]) {
        System.out.println(nprime(29));
        
    }
    
}
