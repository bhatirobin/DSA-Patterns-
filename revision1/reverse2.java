import java.util.*;
public class reverse2 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int r = 0;
        int ans =0;

        while(n > 0)
        {
            r = n%10;

            ans = ans * 10 + r;

            n = n/10;

        }
        System.out.println(ans);
        
    }
    
}
