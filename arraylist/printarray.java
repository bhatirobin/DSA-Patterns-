import java.util.*;
public class printarray 
{
    public  static void main(String args[])
    {
        ArrayList<Integer> arr1 = new ArrayList<>();

        ArrayList<Integer> arr2 = new ArrayList<>();
        System.out.println("this is first array:-"+arr1);

        System.out.println("this is second array:-"+arr2);

        for(int i=1; i<=5; i++)
        {
            arr1.add(i);
            arr2.add(i);
        }
        System.out.println("after first arrray:-"+arr1);

        System.out.println("after second array:-"+ arr2);
    }
    
}
