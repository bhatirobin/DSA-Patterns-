import java.util.*;
public class divisible2 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the value of n");

        int n = sc.nextInt();

        if(n % 3 == 0 && n % 5 == 0)
        {
            System.out.println("n number are the totally divisible by 3 and 5");
        }
        else
        {
            System.out.println("n number are not totally divide by 3 and 5");
        }
        
    }
    
}
