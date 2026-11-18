import java.util.*;
public class clear 
{
    public static void main(String args[])
    {
        ArrayList<Integer> arr1 = new ArrayList<>();

        arr1.add(546);
        arr1.add(657);
        arr1.add(836);
        arr1.add(534);

        System.out.println("before clear for arraylist:-"+arr1);

        arr1.clear();
        System.out.println(" after clear for the arraylist:-"+arr1);
    }
    
}
