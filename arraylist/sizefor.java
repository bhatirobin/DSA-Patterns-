import java.util.*;
public class sizefor 
{
    public static void main(String args[])
    {
        ArrayList<Integer> vr = new ArrayList<>();

        vr.add(45);
        vr.add(46);
        vr.add(48);
        vr.add(50);
        vr.add(54);

        System.out.println(vr);

        for(int i=0; i<vr.size(); i++)
        {
           System.out.println(vr.get(i));
        }
    }
    
}
