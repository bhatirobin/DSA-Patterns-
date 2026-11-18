import java.util.*;
public class arr25 
{
    public static int targatesum(int arr[], int targate)
    {
        int n = arr.length;
        int ans = 0;

        for(int i=0; i<n; i++)
        {
            for(int j=i+1; j<n; j++)
            {
                if((arr[i]+arr[j]) == targate)
               {
                   ans++;
               }
           }
        }
        System.out.println("this is count of targate ="+ans);

        return ans;

    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

       // System.out.println("enter the range of an array");

          

          System.out.println("enter input of the array elements");

           int arr[] = new int[6];

           for(int i=0; i<6; i++)
           {
            arr[i] = sc.nextInt();

           }
            System.out.println(targatesum(arr, 7));

    }
    
}
