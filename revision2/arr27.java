import java.util.*;
import java.util.Arrays;
public class arr27 
{
    public static int onenum(int arr[])
    {
        int n = arr.length;
        
        for(int i=0; i<n; i++)
        {
             for(int j=i+1; j<n; j++)
              {
                if(arr[i] == arr[j])
                    {
                        arr[i] = -1;
                        arr[j] = -1;
                    }
              }
        }
           int ans = -1;
        for(int i=0; i<n; i++)
          {
            if(arr[i] > 0)
              {
                ans = arr[i];
              }
          }

          System.out.println("the posititve number are once in array="+ans);

          return ans;

    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter input frome  elements of array");

        int arr[] = new int[7];

        for(int i=0; i<7; i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.println(onenum(arr));
        
    }
    
}
