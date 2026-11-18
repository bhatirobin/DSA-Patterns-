import java.util.*;
public class addall2 
{
    public static void main(String args[])
    {
        ArrayList<Integer> arr1 = new ArrayList<>();

        arr1.add(100);
        arr1.add(150);
        arr1.add(200);
        arr1.add(250);

        System.out.print(" print the first array elements:-");

        for(int i: arr1)
        {
            System.out.println(i+" ");
        }

        ArrayList<Integer> arr2 = new ArrayList<>();

        arr2.add(300);
        arr2.add(350);
        arr2.add(400);
        arr2.add(450);

        System.out.print("print the second array elements");

        for(int j: arr2)
        {
            System.out.println(j+" ");
        }

        arr1.addAll(2, arr2);

        System.out.println("print the collection for the array");

        for(int k:arr1)
        {
            System.out.print(k+" ");
        }
        System.out.println();

    }
    
}
