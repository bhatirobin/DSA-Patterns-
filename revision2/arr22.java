import java.util.*;
public class arr22 
{

    public static boolean sorted(int arr[])
    {
        boolean check = true;
        for(int i=1; i<arr.length; i++)
        {
            if(arr[i] < arr[i-1])
            {
                check  = false;
                break;
            }
           
        }
        return check;
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        int arr[] = {2,4,6,7,9,12,15,19,22,27,30};

        System.out.println(sorted(arr));
        
    }
    
}
