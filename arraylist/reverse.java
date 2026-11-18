import java.util.*;
public class reverse
{
    public static void main(String args[])
    {
        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(458);
        arr.add(857);
        arr.add(1456);
        arr.add(365);
        arr.add(759);
      //  System.out.println(arr);

        for(int i=arr.size()-1; i>=0; i--)
        {
            System.out.print(arr.get(i)+" ");
        }
    }
}