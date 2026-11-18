import java.util.*;
public class checkempty 
{
    public static void main(String args[])
    {
        ArrayList<Integer> arr = new ArrayList<>();

      //  arr.add(37);
       // arr.add(673);

        boolean ans = arr.isEmpty();

        if(ans)
        {

            System.out.println("the array list is empty");
        }
        else{
            System.out.println("array list array list are not empty");
        }
   
        arr.add(74);

        ans = arr.isEmpty();

        if(ans)
        {
            System.out.println("array lis is empty");
        }
        else
         {
            System.out.println("array list is not empty");
         }

    }
    
}
