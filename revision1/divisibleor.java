import java.util.*;
public class divisibleor 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the value of n");

        int n = sc.nextInt();

        if(n % 3 == 0 || n % 5 == 0)
        {
            System.out.println("n number is divible ");
        }
        else
        {
            System.out.println("n number are not divisible by 3 and 5");


        }
        
    }
    
}
