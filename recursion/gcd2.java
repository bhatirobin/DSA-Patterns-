import java.util.*;
public class gcd2 
{
       public static int gcd(int x, int y)
       {
        //here are make the base case
        if(y == 0) return x;
        return gcd(y, x%y);
        
       }
          public static void main(String args[])
          {
            Scanner sc = new Scanner(System.in);
            int x = sc.nextInt();
            int y = sc.nextInt();
              
            System.out.println(gcd(x, y));

          }
    
}
