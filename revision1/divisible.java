import java.util.*;
public class divisible 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
         System.out.println(" enter the value of n number");

         int n = sc.nextInt();

         if( n % 5 == 0)
         {
            System.out.println("the n number is divisible for 5");
         }
         else
         {
            System.out.println("Here are n is not divisible for 5");
         }
        
    }
    
}
