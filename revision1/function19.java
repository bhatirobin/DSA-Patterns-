import java.util.*;
public class function19 
{
        public static void traingle01(int n)
        {
           // int arr[][];
            for(int i=1; i<=n; i++)
            {
                for(int j=0; j<=i; j++)
                {
                    
                    if((i+j) % 2 == 0)
                    {
                        System.out.print("1");
                    }
                    else
                    {
                        System.out.print("0");
                    }
                }
                System.out.println();
            }
        }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the value pattern number");

        int n = sc.nextInt();

        traingle01(n);


    }
    
}
