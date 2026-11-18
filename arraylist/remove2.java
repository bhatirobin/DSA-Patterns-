import java.util.*;
public class remove2 
{
    public static void main(String args[])
    {
        ArrayList<String> arr = new ArrayList<>();

        arr.add("hello");
        arr.add("robin");
        arr.add("bhati");
        arr.add("where");
        arr.add("are you ");

        System.out.println(arr);

      arr.remove("hello");

        System.out.println(arr);

        LinkedList<String> arr1 = new LinkedList<>();

        arr1.add("hello");
        arr1.add("varsha");
        arr1.add("bhati");
        arr1.add("where");
        arr1.add("are you");

        System.out.println(arr1);

        arr1.remove("where");
        System.out.println(arr1);
    }
    
}
