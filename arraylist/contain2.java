import java.util.*;
public class contain2 
{
    public static void main(String args[])
    {
        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(636);
        arr.add(293);
        arr.add(493);
        arr.add(765);
        arr.add(948);


        boolean ans = arr.contains(636);

        if(ans)
        {
            System.out.println("this array list are contain 636");
        }
        else{
            System.out.println("this list are not contain for 636");
        }

        ans = arr.contains(976);

        if(ans)
        {
            System.out.println("this list are contain for 976");
        }
        else{
            System.out.println("this lis are not contain for this number 976");
        }
    }
    
}
