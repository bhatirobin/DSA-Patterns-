import java.util.*;
public class reversenumber 
{
    public static void main(String[] args) 
    {
        
    
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    int sum=0;

      int ans =0;

    while(n>0)
    {
        sum = n% 10;

        ans = ans * 10 + sum;

        n = n/10;

      //  System.out.println(ans);
   }
   System.out.println(ans);
 }
    
}

    
    