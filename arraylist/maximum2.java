import java.util.*;
public class maximum2 
{
    public static void main(String args[])
        {
            ArrayList<Integer> r =new ArrayList<>();

            r.add(763);
            r.add(84);
            r.add(821);
            r.add(8500);
            r.add(1050);
            r.add(2864);

            int max = Integer.MIN_VALUE;

           for(int i=0; i<r.size(); i++)
           {
            max = Math.max(max, r.get(i));
           }
           System.out.print("It is the maximum element in array :-"+ max);
  
        }    
}
