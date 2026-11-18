import java.util.*;
import java.util.ArrayList;
public class remove 
{
    public static void main(String args[])
    {
        ArrayList<Integer> v = new ArrayList<>();

        v.add(38);
        v.add(35);
        v.add(46);
        v.add(87);
        v.add(376);
  
        System.out.println(v);


        v.remove(1); //here are remove he index size based
        System.err.println(v);

    }
    
}
