import java.util.*;
public class arr17 
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
    
    System.out.println("print the original array elements=");
    print(arr);

    //here are you create an array2 and copy in first array
    //elements to index forn & to index
    
    int arr2[] = Arrays.copyOfRange(arr, 1, 4);

    System.out.println("the copy array elements in second array=");
     print(arr2);

  }    
}
