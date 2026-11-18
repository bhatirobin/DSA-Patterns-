import java.util.*;
import java.util.Arrays;
public class arr42 
{
    static void sumarr(int arr[][], int arr2[][])
       {

         int sum[][] = new int[3][3];
          
          for(int i=0; i<arr.length; i++ )
            {
                for(int j=0; j<arr[i].length; j++)
                  {
                     System.out.print(arr[i][j]+" ");
                  }
                  System.out.println();
            }

            for(int i=0; i<arr2.length; i++)
              {
                  for(int j=0; j<arr2[i].length; j++)
                    {
                        System.out.print(arr2[i][j]+" ");
                    }
                    System.out.println();
              }
              for(int i=0; i<3; i++)
              {
                for(int j=0; j<sum[i].length; j++)
                {
                    sum[i][j] += arr[i][j] + arr2[j][i];

                    System.out.print(sum[i][j]+" ");
                }
                System.out.println();
              }
       }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[3][3];

           for(int i=0; i<3; i++)
             {
                  for(int j=0; j<3; j++)
                    {
                        arr[i][j] = sc.nextInt();
                    }
             }

             int [][] arr2 = new int[3][3];
              
             for(int i=0; i<3; i++)
               {
                   for(int j=0; j<3; j++)
                    {
                        
                          
                               arr2[i][j] = sc.nextInt();
                          
                    }
               }
        
               sumarr(arr, arr2);

    }
    
}
