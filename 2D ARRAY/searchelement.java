import java.util.*;
public class searchelement {
    public static int  search(int arr[][],int key)
    {
        for(int i=0; i<arr.length; i++)
        {
            for(int j=0; j<arr[0].length; j++)
            {
                if(arr[i][j]==key)
                {
                    System.out.print("found at index ("+ i + "," + j +")");
                  //  return key;
                }
            }
            
        }
        return  key;
    }
    public static void main(String[] args) {
        int arr[][]=new int [3][3];
        int n=3,m=3;
        int key = 9;
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<m; j++)
            {
                arr[i][j] =sc.nextInt();
            }
        }
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<m; j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        search(arr, key);
    }
    
}
