import java.util.*;
public class addelement
{
    public static void main(String args[])
    {
        ArrayList<Integer> r1 = new ArrayList<>();

        r1.add(12);
        r1.add(19);
        r1.add(78);
        r1.add(1021);
        r1.add(45);
        r1.add(36);
        r1.add(21);
        r1.add(51);

//.add function are add the element in array 

//now here is the print for the arraylist
      System.out.println(r1);


      //now we are opreation performthe take it index value through for the get() function

     // int element = r1.get(3);

     // System.out.println(element);

     // r1.remove(2);

     // System.out.println(r1);

      r1.set(3, 2207);
      System.out.println(r1);


    }

}