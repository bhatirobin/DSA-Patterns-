import java.util.*;
public class sumfor2 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the value of n ");

        int n = sc.nextInt();

        System.out.println("enter the value of limit");

        int l = sc.nextInt();

        int sum = 0;

        for(int i=n; i<=l; i++)
          {
            sum = sum+n;
            System.out.println("before two nember are adding+"+sum);

            n++;
          }
        
    }
    
}
