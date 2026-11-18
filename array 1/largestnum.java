import java.util.*;
public class largestnum {
    public static int largest(int num[] )
    {
        int largest = Integer.MIN_VALUE; //it is represent - infinity
        //int smallest =Integer.MAX_VALUE;
        for(int i=0; i<num.length; i++)
        {
            if(largest < num[i])
            {
                  largest = num[i];
            }
            /*if(smallest > num[i])
             * {
             * smallest = num[i];
             * }
             */
        }
        //System.out.println("smallest value is : " + smallest);
        return largest;
    }
    public static void main(String args[])
    {
       int num[] = { 12,6,32,9,15,87,98,23};
       System.out.println("largest value is : " + largest(num));       
    }

}
