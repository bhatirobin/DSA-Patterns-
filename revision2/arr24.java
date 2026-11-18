import java.util.*;
public class arr24 
{


    public static void makesort(int arr[])
    {
        

        Arrays.sort(arr);
        System.out.println("print the sorted array");
        for(int i=0; i<arr.length; i++)
        {
            
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter input the array elements");

        int arr[] = new int[5];

        for(int i=0;  i<5; i++)
          {
            arr[i] = sc.nextInt();
          }   
            
          System.out.println("print the array elements");
          for(int i=0; i<arr.length; i++)
          {
            
              System.out.print(arr[i]+" ");
          }
           makesort(arr);
    }
    
}
