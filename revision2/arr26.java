import java.util.*;
import java.util.Arrays;
public class arr26 
{
    public static int targatesum(int arr[], int targate)
    {
        int n = arr.length;
        int ans = 0;

        for(int i=0; i<n; i++)
           {
              for(int j=i+1; j<n; j++)
              {
                  for(int k=j+1; k<n; k++)
                  {
                    if((arr[i]+arr[j]+arr[k]) == targate)
                      {
                        ans++;
                      }
                  }  
              }
           }
           System.out.println("the count of targate sum ="+ans);

           return ans;
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the input of an array elements: =");

        int arr[] = new int[5];

        for(int i=0; i<5; i++)
        {
            arr[i] = sc.nextInt();
        }
        
        System.out.println(targatesum(arr, 12));

    }
}
