import java.util.*;
public class forcontinue 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i=n; i<=50; i++)
// while(n<=50)
        {
          if(i%3==0)
            {
               // System.out.println(n);
                continue;
            }

            System.out.println(i);
            
        }
        n++;
    }
    
}
