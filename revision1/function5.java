// binomial coefficient := permutation and combination
import java.util.*;
public class function5 
{
   
    // public static int com(int v, int n)
    // {
    //        for(int i=1; i<=n; i++)
    //        {
    //         v = v*i;
    //         System.out.println(v);
    //        }
         
           
    //        return v;
    // }
    
    //   public static void main(String args[]) 
    //   {
    //     Scanner sc = new Scanner(System.in);

    //     System.out.println("enter the value of n");
          
    //     int n = sc.nextInt();

    //     int v = 1; 

    //       com(n, v);
        
    //   }


    public static int factorial(int n)
    {
        int fact = 1;
        for(int i=1; i<=n; i++)
        {
            fact = fact*i;
        }
        System.out.println(fact);

        return fact;
    }

    public static int cofficient(int n, int r)
      {
        
        int factn = factorial(n);
        int factr = factorial(r);
        int factncr = factorial(n-r);

        int ans = factn / (factr * factncr);

        

        // int a = factn;
        // int b = factr * factncr;
        

        // int ans = a/b;

        System.out.println(ans);

        return ans;
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        //System.out.println("enter the value of loop");
        
      // int l = sc.nextInt();
        
      //  System.out.println("enter the value of n");

        //int n = sc.nextInt();

       // System.out.println("enter the value of r");

       //int r = sc.nextInt();

       cofficient(5, 2);

    }
    
}
