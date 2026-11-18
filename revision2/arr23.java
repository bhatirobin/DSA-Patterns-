import java.util.*;
public class arr23 
{
    public static int[] minmax(int arr[])
    {
        Arrays.sort(arr);
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }
        int ans[] = {arr[0], arr[arr.length-1]};

        return ans;
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        int arr[] = {54,3,46,94,73,65,64,445,256,65};

        int ans[] = minmax(arr);

        System.out.println();
        System.out.println("smallest num is="+arr[0]);
        System.out.println("the largest number is="+ arr[arr.length-1]);
        
    }
    
}
