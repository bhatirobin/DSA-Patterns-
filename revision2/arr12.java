import java.util.*;
public class arr12 
{

    static void arr1D(int[] arr)
    {
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];

        //taking input the all array elements

        for(int i=0; i<arr.length; i++)
        {
                arr[i] = sc.nextInt();
        }
             arr1D(arr);
    }
    
}
