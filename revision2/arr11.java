import java.util.*;
public class arr11 
{
    static void input(int arr[][])
    {
        for(int i=0; i<arr.length; i++)
        {
            for(int j=0; j<arr.length; j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
       
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

      //  System.out.println("enter the value to take the array size=");

      //  int n = sc.nextInt();

        int arr[][] = new int[3][3];

        for(int i=0; i<arr.length; i++)
        {
            for(int j=0; j<arr.length; j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
       

        
          input(arr);
        
    }
    
}
