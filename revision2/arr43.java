import java.util.*;
import java.util.Arrays;
public class arr43 
{
    public static void print(int matr[][])
        {
            for(int i=0; i<matr.length; i++)
               {
                  for(int j=0; j<matr[i].length; j++)
                    {
                        System.out.print(matr[i][j]+" ");
                    }
                    System.out.println();
               }
        }
     public static void sumarray(int[][] arr, int r1, int c1, int[][] arr2, int r2, int c2)
         {
              /*if(r1 != c1 || r2 != c2)
                {
                    System.out.println("here are you fill wrong input :- addition are not possible");
                    return;
                }*/
     
      int sum[][] = new int[r1][c1];
      
         for(int i=0; i<r1; i++) 
            {
                for(int j=0; i<c1; j++)
                  {
                    sum[i][j] = arr[i][j]+arr2[i][j];           
                  }
                          
            }
       System.out.println();
         print(sum);
           
        }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

         System.out.println("enter the range row and columns");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        int[][] arr = new int[r1][c1];

        System.out.println("enter input elements the first array ");
        for(int i=0; i<r1; i++)
        {
            for(int j=0; j<c1; j++)
              {
                arr[i][j] = sc.nextInt();
              }
        }
        System.out.println("enter the range of row and column:");
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();
        int[][] arr2 = new int[r2][c2];
          System.out.println("enter input elements fron the second array");        
          for(int i=0; i<r2; i++)
            {
                for(int j=0; j<c2; j++)
                  {
                      arr2[i][j] = sc.nextInt();
                  }
            }
            print(arr);
         print(arr2);

         sumarray(arr, r1, c1, arr2, r2, c2);
    }
    
}
