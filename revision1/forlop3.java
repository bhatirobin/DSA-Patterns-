import java.util.*;
public class forlop3 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

    //    System.out.println("enter the value of n");

     //   int n = sc.nextInt();

        System.out.println("enter the value of limit");

        int l = sc.nextInt();

        int sum = 0;

        for(int i=l-1; i>1; i--)
        {
   
            sum = sum+l;

            System.out.println(sum);

            l--;

        }
        
    }
    
}
