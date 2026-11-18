import java.util.*;
public class function8 
{
    public static void prime(int n)
    {
        for(int i=2; i<=n-1; i++)
        {
            if(n % i == 0)
            {
                System.out.println("the number is not prime");
            }
            else
            {
                System.out.println("number is prime");
                  break;
            }
        }
    }
    public static void main(String[] args) 
    {
        prime(15);
        
    }
    
}
