import java.util.*;
public class arr48 
{

    public  static void print(int arr[][])
      {
        for(int i=0; i<arr.length; i++)
          {
            for(int j=0; j<arr[i].length; j++)
              {
                System.out.print(arr[i][j]+" ");
              }
              System.out.println();
          }
      }

      public static int[][] transpose(int arr[][], int r, int c)
         {
            int ans[][] = new int[c][r];

              for(int i=0; i<c; i++)
               {
                  for(int j=0; j<r; j++)
                    {
                        ans[i][j] = arr[j][i];
                    }
               }
               return ans;
         }

         public static void reverseArray(int arr[])
         {
            int i=0,j=arr.length-1;

            while(i < j)
              {
                int temp = arr[i];
                arr[i] =  arr[j];
                arr[j] = temp;
                i++;
                j--;
              }
         }
      public static void rotated(int arr[][], int n)
      {
        //int arr2[][] = new int[c][r]

            transpose(arr, n, n);
          
            for(int i=0; i<n; i++)
              {
                reverseArray(arr[i]);
              }
        }
 public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the range of matrix");

        int r = sc.nextInt();
        int c = sc.nextInt();

        System.out.println("enter the elements of an matrix");

        int arr[][] = new int[r][c];

        for(int i=0; i<r; i++)
          {
            for(int j=0; j<c; j++)
              {
                arr[i][j] = sc.nextInt();
              }
          }

          System.out.println("print the original matrix:");

          print(arr);

          System.out.println("print rotated");

          rotated(arr, r);

          System.out.println("print rotation matrix");
          print(arr);
        
    }
    
}
