import java.util.*;
import java.util.Arrays;
public class arr44 
{
    static void multiply(int arr[][], int arr2[][])
       {
          for(int i=0; i<arr.length; i++)
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

              int multi[][] = new int[3][3];

              for(int i=0; i<3; i++)
                {
                    for(int j=0; j<multi[i].length; j++)
                     {
                        for(int k=0; k<multi[j].length; k++)
                        multi[i][j] += arr[i][j] * arr2[i][j];
                        System.out.print(multi[i][j]+" ");                       
                     }
                    System.out.println();
                    }
       }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter input elements from in array");

        int arr[][] = new int[2][4];

        for(int i=0; i<2; i++)
         {
              for(int j=0; j<4; j++)
              {
                arr[i][j] = sc.nextInt();
              }
         }

         System.out.println("enter input elements from in an array");

         int arr2[][] = new int[4][3];

         for(int i=0; i<4; i++)
           {
             for(int j=0; j<3; j++)
                {
                    arr2[i][j] = sc.nextInt();
                }
           }
           multiply(arr, arr2);
        
    }
    
}
