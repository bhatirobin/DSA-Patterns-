import java.util.*;
public class arr4 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[5];

        for(int i=0; i<5; i++)
        {
            arr[i] = sc.nextInt();
        }

        for(int array: arr)
        {
            System.out.print(array+" ");
        }
        
    }
    
}
