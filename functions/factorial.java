import java.util.*;
public class factorial {
    public static int factorial(int n)
    {
        //Scanner sc = new Scanner(System.in);
        int fact =1;
        
        for(int i=1;i<=n;i++)
        {
            fact = fact*i;
            System.out.println(fact);
        }
       // System.out.println(fact);
        return fact;
    }
    public static void main(String args[]) {
        //4 ek integer value hai jo n ke and store hai 
        factorial(4);
        
    }
    
}
