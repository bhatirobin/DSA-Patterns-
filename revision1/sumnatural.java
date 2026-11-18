import java.util.*;
public class sumnatural 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the value of limit =");

        int l = sc.nextInt();

        int sum = 0;

        int n = sc.nextInt();

        while(n <= l)
        {

             sum = sum+n;
           //  n++;

         //    System.out.println(sum+" ");

             n++;
        }
        System.out.println(sum);
        
    }

    
}
