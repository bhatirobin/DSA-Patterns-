import java.util.*;
import java.util.Arrays;

public class arr39 
{
    public static void print(int arr[])
      {
        for(int i=0; i<arr.length; i++)
        {
            System.out.println(arr[i]+" ");
        }
      }
    public static int[] prefix(int arr[])
    {
        int n = arr.length;
        int psum[] = new int[n];
        psum[0] = arr[0];

        for(int i=1; i<=n; i++)
          {
           psum[i] = psum[i-1] + arr[i];
          }
          return psum;
          
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the input of an array elements");

        int arr[] = new int[5];

        for(int i=0; i<5; i++)
          {
            arr[i] = sc.nextInt();
          }
       
          int[] prefixs = prefix(arr);

          System.out.println(prefixs);

       
        }
    
}
