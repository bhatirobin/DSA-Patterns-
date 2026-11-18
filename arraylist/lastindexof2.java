import java.util.*;
public class lastindexof2 
{
    public static void main(String args[])
    {
        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(100);
        arr.add(200);
        arr.add(300);
        arr.add(400);
        arr.add(500);
        arr.add(600);

        System.out.println("the list is initialy:-"+arr);

        int index = arr.lastIndexOf(400);

        if(index!= -1)
        {
            System.out.println("the last index of"+"400 is element at index:-"+index);
        }
        else
        {
            System.out.println("400 is not present in :-"+ "in the list");
        }

        index = arr.lastIndexOf(8783);
        
        if(index != -1)
        {
            System.out.println("the lastindex of 8783"+"is"+ index);
        }
        else
        {
            System.out.println("8783 is not present in "+ "the list");
        }
    }
    
}
