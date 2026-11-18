import java.util.*;
public class threedigit 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the value of n");

        int n = sc.nextInt();

        if(n > 99 && n<1000)
        {
            System.out.println("n are make for three digit number:");
        }
        else
        {
            System.out.println("n are not make for three digit number");
        }
        
    }
    
}
