import java.util.*;

public class arr50 
{
      public static void printmatrix(int arr[][])
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

      public static void spiral(int arr[][], int r, int c)
         {
            int toprow = 0, bottom = r-1, leftcol = 0, rightcol = c-1;
            
            int total = 0;
            while(total < r*c)
              {
                //(1) = toprow -> leftcol to rightcol
                  for(int j=leftcol; j<rightcol; j++)
                  {
                    System.out.print(arr[toprow][j]+" ");
                      total++;
                }
                  toprow++;

                  //(2) = rightcolumn -> toprow to bottimrow

                     for(int i=toprow; i<bottom; i++ )
                     {
                        System.out.print(arr[i][rightcol]+" ");
                         total++;
                    }
                       rightcol--;

                     //(3) -> = bottomrow = rightcolumn to leftcol
                     for(int j=rightcol; j<leftcol; j++)
                       {
                        System.out.print(arr[bottom][j]+" ");
                         total++;   
                    }
                       bottom--;

                    // (4) -> = leftcol = bottom to toprow

                    for(int i=bottom; i>=toprow; i++)
                    {
                        System.out.print(arr[i][leftcol]+" ");
                        total++;
                    }
                    leftcol++;
              }

         }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the range of row an");
           
        int r = sc.nextInt();
        int c = sc.nextInt();

        System.out.println("enter the input elements of matrix;");

           int arr[][] = new int[r][c];

           for(int i=0; i<r; i++)
             {
                  for(int j=0; j<c; j++)
                     {
                        arr[i][j] = sc.nextInt();
                     }
             }
             System.out.println("print the original matrix:");
              printmatrix(arr);

              System.out.print("print the spiral matrix:");
                 spiral(arr, r, c);
   }   
}
