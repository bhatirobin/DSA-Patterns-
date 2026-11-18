import java.util.*;
public class addatindex 
{

    public static void main(String args[])
    {
        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(45);
        arr.add(74);
        arr.add(12);
        arr.add(34);
        arr.add(65);


        System.out.println(arr);

        arr.add(2, 40);

        System.out.println(arr);
    }
    
}
