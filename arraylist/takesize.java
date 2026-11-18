import java.util.ArrayList;
public class takesize 
{
    public static void main(String args[])
        {
            ArrayList<Integer> rv = new ArrayList<>();

            rv.add(84);
            rv.add(821);
            rv.add(263);
            rv.add(1050);
            rv.add(9000);

            System.out.println(rv.size()); 

            for(int i=0; i<rv.size(); i++)
            {
                //System.out.println(rv.size());

                System.out.print(rv.get(i)+" ");
            }
        }
}
