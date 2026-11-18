import java.util.*;
import java.util.Arrays;

public class arr35 
{
      static int[] reverse(int arr[])
      {
        int n = arr.length;
        int ans[] = new int[n];
        int j =0;

        for(int i=n-1; i>=0; i--)
          {
            ans[j++] = arr[i];
          }

          return ans;
      }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the input elements from in array");

        int arr[] = new int[7];

        for(int i=0; i<7; i++)
        {
            arr[i] = sc.nextInt();
        }

        int ans[] = reverse(arr);
    
       for(int i=0; i<ans.length; i++)
       {
        System.out.print(ans[i]+" ");
       }
    }
    
}
