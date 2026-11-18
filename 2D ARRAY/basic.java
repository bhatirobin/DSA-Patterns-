import java.util.*;
public class basic {
public static void main(String args[])
{
    int arr[][]=new int[3][3];
  //  Scanner sc =new Scanner(System.in);
    int n =3;
    int m = 3;
    Scanner sc =new Scanner(System.in);
    for(int i=0; i<n; i++)
    {
        for(int j=0; j<m; j++)
        {
            arr[i][j]=sc.nextInt();
        }
    }
    //print the matrix
    for(int i=0; i<n; i++)
    {
        for(int j=0; j<m; j++)
        {
            System.out.print(arr[i][j]+" ");
        }
        System.out.println();
    }
  //  System.out.println();
}    
}
