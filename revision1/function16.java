import java.util.*;
public class function16 
{
    public static void halfpyramid(int n)
    {
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=n-i; j++)
            {
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) 
    {
          Scanner sc = new Scanner(System.in);
          
          System.out.println("enter the value of n ");

          int n = sc.nextInt();

          halfpyramid(n);
    }
    
}
