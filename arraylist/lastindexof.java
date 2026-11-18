import java.util.*;
public class lastindexof 
{
    public static void main(String args[])
    {
        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(2);
        arr.add(3);
        arr.add(1);
        arr.add(4);
        arr.add(2);
        arr.add(4);

        System.out.println(arr);

      //  System.out.println("element at first position in array:-"+arr.indexOf(2));

       // System.out.println("array at last index position :-"+arr.lastIndexOf(2)+1);
    
       int p1 = arr.indexOf(2);

       int p2 = arr.lastIndexOf(2);

       
      // p2 = p2 +1;

       System.out.println("array element are exist the first position"+p1);

       p2 = p2 +1;


       System.out.println("array element are exist at last index:-"+p2);

    }
    
}
