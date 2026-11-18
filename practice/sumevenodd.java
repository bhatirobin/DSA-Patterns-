import java.util.*;
public class sumevenodd 
{
    public static int sum(int n)
    {
        
        
            if(n == 0)
            {
                return 0;
            }
        
            // this  condition is even condition
            if(n%2 == 0)
            {
                int s = sum(n-1)-n;
                return s;
            }
            //this condition is a odd calculate
            else{
                int p =n + sum(n-1);
                return p;
            }
        }
    
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        System.out.println(sum(n));
    }
    
}
