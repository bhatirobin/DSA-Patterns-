import java.util.*;
import java.util.Arrays;
public class arr37 
{
    static void rotated(int arr[])
    {
         int n1 = arr.length;
         int k = n1%k;
         int ans[] = new int[n1];
         int j = 0;
        for(int i=n1-k; i<n1; i++)
        {
            System.out.print(arr[i]+" ");
            
        }
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the input elements of an array");

        int arr[] = new int[7];

        for(int i=0; i<7; i++)
           {
                arr[i] = sc.nextInt();

           }
              rotated(arr);                    
    }
    
}
