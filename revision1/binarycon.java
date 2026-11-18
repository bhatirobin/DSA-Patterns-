import java.util.*;
public class binarycon 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the value of n");

        int n = sc.nextInt();

        int ans = 0;
        int pow = 1;

        while(n>0)
        {
            int unit = n%10;
            ans+= (unit * pow);

            n /= 10;

            pow*= 2;

        }
        System.out.println(ans);
        
    }
    
}
