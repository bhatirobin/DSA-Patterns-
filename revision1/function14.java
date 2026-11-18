import java.util.*;
public class function14 
{

    public static void sum(int n)
    {
        int sum =0;
        while(n>0)
        {
            sum += n % 10;

            n = n/10;

            System.out.println(sum);

        }
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("enter the value of n");

        int n = sc.nextInt();

        sum(n);

    }
    
}
