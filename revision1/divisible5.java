import java.util.*;
public class divisible5 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the value of n");

        int n = sc.nextInt();

        if(n % 5 == 0 || n % 3 == 0  )
        {
            if(n % 15 != 0)
            {
                System.out.println("the n number is divisible by 3 and 5 but not divisible by 15");
            }
            else
            {
                System.out.println("the n number is not divisible ");
            }
        }
    }
    
}
