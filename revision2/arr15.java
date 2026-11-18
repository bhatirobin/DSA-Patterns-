import java.util.*;
public class arr15 
{

    static void print(int arr[])
    {
        for(int i=0; i<5; i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[5];

        for(int i=0; i<5; i++)
        {
            arr[i] = sc.nextInt();

        }
          // int arr2[] = arr.clone();

           System.out.println("original array elements");
           print(arr);

       //    int arr2[] = arr.clone();
       int arr2[] = Arrays.copyOf(arr, arr.length);
         //  System.out.println("before the changing of the second array");
           //print(arr2);
          
           arr2[0] = 0;
           arr2[1] = 0;
              
          //int arr2[] = arr.clone();
           System.out.println("after changed the first array=");
           print(arr2);

           System.out.println("after changing the second array");
           print(arr2);
    }
    
}
