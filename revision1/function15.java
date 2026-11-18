import java.util.*;
public class function15 
 {

    public static void patternh(int n)
    {
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=n; j++)
            {
         //       System.out.println(" ");
            
                 if(i==1 || i==n || j == 1 || j == n)
                 {
                     System.out.print("*");
                  }
               else
               {
                   System.out.print(" ");
               }
           
                   // System.out.println();
            }

             System.out.println();
        }
       
        
    }
    public static void main(String[] args) 
    {
       Scanner sc = new Scanner(System.in);
         
       System.out.println("enter the value of n");

       int n = sc.nextInt();

       patternh(n);


    }
    
}
