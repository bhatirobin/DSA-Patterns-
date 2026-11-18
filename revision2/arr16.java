import java.util.*;
public class arr16 
{
    
       static void print(int arr[])
       {
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
       }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the elements of an array");

        int arr[] = new int[5];

        for(int i=0; i<5; i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.println("print the first original array elements");
        print(arr);

        int arr2[] = Arrays.copyOf(arr, 4);

        System.out.println("print the copy of an first array elements");
        print(arr2);
        
    }
    
}
