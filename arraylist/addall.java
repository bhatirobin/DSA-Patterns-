import java.util.*;
public class addall 
{
    public static void main(String args[])
    {
        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(456);
        arr.add(245);
        arr.add(365);
        arr.add(658);
        
        System.out.println("print the first array");

        for(int i: arr)
        {
            System.out.println(i+" ");
        }

        ArrayList<Integer> arr1 = new ArrayList<>();

        arr1.add(698);
        arr1.add(78);
        arr1.add(300);
        arr1.add(754);

        System.out.println("print the second array");

        for(int j: arr1)
        {
            System.out.println(j+" ");
        }
        arr.addAll(arr1);
        System.out.println("printing the all elements for collections array");

        for(int k: arr)
        {
            System.out.print(k+" ");
        }

    }
    
}
