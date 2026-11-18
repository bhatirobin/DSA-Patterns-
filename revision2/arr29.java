import java.util.*;
import java.util.Arrays;
public class arr29 
{
       
      public static void repeating(int arr[])
      {
        int ans = 0;

        for(int i=0; i<arr.length; i++)
        {
               for(int j=i+1; j<arr.length; j++)
                  {
                      if(arr[i] == arr[j])
                        {
                            ans++;
                        //
                           System.out.println(ans);

                        }

                  }
        }
        System.out.println("the count of an element ="+ans);
      }
      public static void main(String[] args) 
      {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter input element for an array =");

        int arr[] = new int[7];

        for(int i=0; i<7; i++)
        {
            arr[i] = sc.nextInt();
        }
           
          repeating(arr);

      }    
}
