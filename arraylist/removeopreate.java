import java.util.*;
public class removeopreate 
{
    public static void main(String args[])
    {
        ArrayList<Integer> rv = new ArrayList<>();

        rv.add(12);
        rv.add(15);
        rv.add(42);
        rv.add(76);
        rv.add(82);

        System.out.println(rv);
        
        rv.remove(2);
        System.out.println(rv);

    }
    
}
