import java.util.*;
public class setopreate 
{
    public static void main(String args[])
    {
        ArrayList<Integer> ar = new ArrayList<>();

        ar.add(121);
        ar.add(159);
        ar.add(422);
        ar.add(706);
        ar.add(820);

        System.out.println(ar);

        ar.set(2, 1231);

        System.out.println(ar);
    }
}
