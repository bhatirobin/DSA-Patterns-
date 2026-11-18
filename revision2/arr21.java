import java.util.*;
public class arr21 
{
    public static void sorted(int arr[])
    {
        for(int i=0; i<arr.length; i++)
           {
              for(int j=i; j<=arr.length; j++)
               {
                
                j = i;
                if(arr[j]<arr[j+1])
                {
                    System.out.println("array are sorted");
                            break;
                }
                else
                {
                    System.out.println("array are not sorted");
                    break;
                }

                }  
           }
           
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        int arr[] = {4,5,7,9,10,17,20};
        
           sorted(arr);

    }
    
}
