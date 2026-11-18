import java.util.*;
public class divisible6 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the value of n");

        int n = sc.nextInt();

        if(n % 5 == 0 || n % 3 == 0 && n % 15 != 0)
        {
            System.out.println("the number are divisible by 3 and 5 but not divisible by 15");
        }
        else
        {
            System.out.println("the number are not divisible ");
        }
    }
    
}
