import java.util.*;
public class arraybasic
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the value of array size number");

        int n = sc.nextInt();

        int[] arr = new int[n];
    
        arr[n] = sc.nextInt();
        for(int i=0; i<=n; i++)
        {
           // arr[i] = sc.nextInt();
          System.out.println(arr[i]);  
        }
          
        
    }

}