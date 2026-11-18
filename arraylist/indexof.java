import java.util.*;
public class indexof 
{
    
    public static void main(String args[])

    {
        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(25);
        arr.add(30);
        arr.add(35);
        arr.add(40);
        arr.add(63);
        
        System.out.println("thi initial value in array list are");

        for(int i: arr)
        {
            System.out.println(i+" ");
        }
        int ind = arr.indexOf(40);

        System.out.println("\n the element 40 at index :"+ind);
    }

    
}
