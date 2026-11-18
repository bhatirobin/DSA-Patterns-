import java.util.*;
public class function13 
{

    public static boolean palind(int n)
    {

        int reverse = 0;
         while(n  != 0)
       {
           int rem = n % 10;
            reverse = reverse * 10 + rem;

             n = n/10;

       }
       if(n == reverse)
       {
        return true;
       }
       return false;

        

    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        palind(n);
        
        
    }
    
}
