import java.util.*;
public class binomial {
    public static int factorial(int n)
    {
        int fact =1;
        
        for(int i=1;i<=n;i++)
        {
            fact = fact*i;
            System.out.println(fact);
        }
       // System.out.println(fact);
        return fact;
    }
    public static int binomial(int r,int n)
    {
        Scanner sc =new Scanner(System.in); 
        int fact_n=factorial(n);
        int fact_r = factorial(r);
        int fact_nmr =factorial(n-r);

        int binomialcoff = fact_n / (fact_r * fact_nmr);
        return binomialcoff;

    }
    public static void main(String args[]) {
       // binomial();
       System.out.println(binomial(5,2));
        
    }

    
}
