import java.util.*;
public class function3 
{
    public static int factorial(int fact, int n)
    {
        for(int i=1; i<=n; i++)
        {
            fact = fact*i;

            System.out.println("this is a number of factorial"+fact);
        }
        return fact;
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the value of n");

        int n= sc.nextInt();

        int fact = 1;

        factorial(fact, n);
    }
    
}
