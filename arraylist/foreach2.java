import java.util.*;
public class foreach2 
{
    public static void main(String args[])
    {
        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(63);
        arr.add(784);
        arr.add(53);

        arr.add(97);
        arr.add(27);

        arr.forEach((n) -> System.out.println(n));
    }
    
}
