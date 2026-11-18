import java.util.*;
public class addlast 
{
    public static void main(String args[])
    {
        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(45);
        arr.add(65);
        arr.add(34);
        arr.add(78);
        arr.add(95);

        System.out.println(arr);

        arr.addLast(100);

        System.out.println(arr);
    }
    
}
