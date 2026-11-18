import java.util.*;
import java.util.Arrays;
//import java.util.Collection;
public class inbuiltsort2 {
    public static void main(String args[])
    {
        Integer num[] ={5,3,7,2,1,4};
        for(int i=0; i<num.length; i++)
        {
            Arrays.sort(num,Collections.reverseOrder());
            System.out.print(num[i]+" ");
        }
        System.out.println();
    }
    
}
