import java.util.*;
public class removeif 
{
    public static void main(String args[])
    {
        ArrayList<Integer> arr = new ArrayList<>();

              arr.add(23);
              arr.add(32);
              arr.add(45);
              arr.add(63);

              arr.removeIf( n -> (n % 3 == 0));

              for(int i:arr)
              {
                System.out.println(i+" ");
              }
    }
    
}
