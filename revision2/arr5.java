import java.util.*;
public class arr5 
{
    static void disp()
    {
        int arr[][] ={{1,2,3},{4,5,6},{7,8,9}};

        for(int i=0; i<arr.length; i++)
        {
            for(int j=0; j<arr.length; j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        // for(int array: arr)
        // {
        //     System.out.println(array);
        // }
    }
    public static void main(String[] args) 
    {
          disp();   
        
    }
    
}
