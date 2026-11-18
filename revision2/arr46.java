import java.util.*;
public class arr46
{
      public static void transpose(int arr[][])
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

        public static int[][] findtranspose(int arr[][], int r, int c)
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
    public static void main(String[] args) 
    {
        Scanner sc  = new Scanner(System.in);

        System.out.println("enter the row and coulumn");
        int r = sc.nextInt();
        int c = sc.nextInt();

        System.out.println("enter the element of an array matrix");

        int arr[][] = new int[r][c];

        for(int i=0; i<r; i++)
          {
              for(int j=0; j<c; j++)
                {
                    arr[i][j] = sc.nextInt();
                }
          }
        transpose(arr);

        int ans[][] = findtranspose(arr, r, c);
           transpose(ans);
    }

}