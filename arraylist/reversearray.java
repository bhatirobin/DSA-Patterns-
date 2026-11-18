import java.util.*;
public class reversearray 
{
    public static void main(String args[])
    {
        ArrayList<Integer> av = new ArrayList<>();

            av.add(763);
            av.add(84);
            av.add(821);
            av.add(263);
            av.add(1050);
            av.add(9000);

          //  av.add(2, 4325);
          
            for(int i=av.size()-1; i>0; i--)
            {
                // if(av.size() == 0)
                // {
                //     System.out.println(av.get(i));
                //     return;
                // }
                System.out.print(av.get(i)+" ");
            }
            System.out.println();
    }
    
}
