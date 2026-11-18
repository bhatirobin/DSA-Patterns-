import java.util.*;
public class arr14 
{

    static void print(int arr[])
    {
        for(int i=0; i<3; i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    } 

    static void change(int arr[])
    {
        for(int i=0; i<3; i++)
        {
            arr[i] = 0;
           System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the value of an array=");

        int arr[] = new int[3];

        for(int i=0; i<3; i++)
        {
             arr[i] = sc.nextInt();
        }
        
       print(arr);
         change(arr);

    }
    
}
