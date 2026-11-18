import java.util.*;
public class divisible4 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the value of n ");

        int n = sc.nextInt();

        if(n % 5 == 0)
        {
            if(n % 3 == 0)
            {
                System.out.println("n number are divisible of 3 and 5");
            }
            else

            {
                System.out.println("n number are not divisible");
            }
        }
        else
        {
            System.out.println("n number are not divisible by 3 and 5");
        }
    }
    
}
