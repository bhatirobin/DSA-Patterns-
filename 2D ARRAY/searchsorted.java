import java.util.*;
public class searchsorted {
    public static boolean sortedmat(int num[][], int key)
    {
      /*   int temp =0;
        for(int i=0; i<num.length; i++)
        {
            for(int j=0; j<num.lenth; j++)
            {
                if(num[i][j]<num[i+1][j+1])
                {
                    temp = num[i][j];
                    num[i][j] = num[i+1][j+1];
                    num[i+1][j+1] = temp;

                }
                System.out.print(num[i][j]+" ");
            }
            System.out.println();
        }

      */
      int row=0 ,col =num[0].length-1;
      while(row<num.length && col>=0)
      {
          if(num[row][col]==key)
           {
                System.out.println("the key is found  at index (" + row + "," + col + ")");
                return true;
            }
          //  System.out.println();
           else if(key< num[row][col])
           {
            col--;
           }
           else{
            row++;
           }
      }
      System.out.println("key is not ound in this matrix");
      return false;
        
        }
    
    public static void main(String args[])
    {
        
        int num[][] = {{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}};
        int key =33;
        
        
        sortedmat(num, key);
    }
    
}
