import java.util.*;
public class arr18 
{

    public static void print(int arr[], int key)
    {
        int count = 0;

        for(int i=0; i<arr.length; i++)
        {
            if(arr[i] == key)
            {
                //count = key ;
                count++;
            }
        }
        System.out.println("the count key in array="+count);
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
         
        System.out.println("enter input the array elements");

        int arr[] = new int[10];
        
            for(int i=0; i<10; i++)
            {
                arr[i] = sc.nextInt();
            }
        
        print(arr, 2);
    }
    
}
