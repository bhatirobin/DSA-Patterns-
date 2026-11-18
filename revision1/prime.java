import java.util.*;
public class prime 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the value of number");

        int n = sc.nextInt();

        if( n % 1 ==0 || n % n == 0)
        {
            System.out.println("n number is prime number");
        }
        else
        {
            System.out.println("n is the not prime number");
        }
        
    }

    
}
