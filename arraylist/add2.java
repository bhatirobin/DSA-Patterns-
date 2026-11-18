import java.util.*;
public class add2 
{
    public static void main(String args[])
    {
        ArrayList<Integer> rv = new ArrayList<>();

        rv.add(84);
        rv.add(837);
        rv.add(243);
        rv.add(454);


        System.out.println(rv);

        rv.add(2, 4253);

        System.out.println(rv);
    }
    
}
