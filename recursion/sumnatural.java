import java.util.*;
public class sumnatural 
{
    public static int sumnatu(int sum)
     {
        if(sum==0)
        {
            return 0;
        }
        int sofn = sumnatu(sum-1);
        int sumint = sum + sumnatu(sum-1);
        return sumint;
         
     }
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        int sum = sc.nextInt();
          System.out.println(sumnatu(sum));
    }
    
}
