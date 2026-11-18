import java.util.*;
public class addfirst 
{
    public static void main(String args[])
    {
        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(654);
        arr.add(46);
        arr.add(68);
        arr.add(365);

        System.out.println(arr);

        arr.addFirst(458);

        System.out.println(arr);
    }
    
}
