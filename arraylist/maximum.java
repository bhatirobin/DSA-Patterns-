import java.util.*;
public class maximum 
{
    // static int ma(int r)
    // {

    // }
  
    public static void main(String args[])
    {
      //  int min = Integer.MIN_VALUE;

        ArrayList<Integer> r = new ArrayList<>();

       // int min = Integer.MIN_VALUE;

        r.add(763);
            r.add(84);
            r.add(821);
            r.add(8500);
            r.add(1050);
            r.add(2864);

            int max = Integer.MIN_VALUE;


            for(int i=0; i<r.size(); i++)
            {
                if(max < r.get(i))
                {
                    max = r.get(i);

                }
            }

           System.out.print("it is the max element in array:-"+max);
    }

}
