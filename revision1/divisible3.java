import java.util.*;
public class divisible3 
{

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the value of n");

        int n = sc.nextInt();

        if(n % 5 == 0 | n % 3 !=0)
        {
            System.out.println("n number are totally divided by 5:");
        }
        else
        {
            System.out.println("n number are not divisible by 3");
        }
        
    }
    
}
