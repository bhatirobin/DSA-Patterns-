import java.util.*;
public class removeall 
{
    public static void main(String args[])
    {
        ArrayList<Integer> arr = new ArrayList<>();

           arr.add(1);
           arr.add(2);
           arr.add(3);
           arr.add(4);
           arr.add(5);

           System.out.println("Arraylist before removeall() opreation:-"+arr);

           ArrayList<Integer> arr1 = new ArrayList<>();

               arr1.add(1);
               arr1.add(2);
               System.out.println("collection of all elements to be removed:-"+arr1);

               arr.removeAll(arr1);

               System.out.println(arr);
    }
    
}
