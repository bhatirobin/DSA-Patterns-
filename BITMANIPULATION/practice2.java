import java.util.*;
public class practice2 {
    public static void main(String args[])
    {
        int x =3 ;
        int y = 7;
        System.out.println("before swap : x = " + x + "and y = "+ y);
        x = x^y;
        y = x^y;
        x = x^y;
        System.out.println("after swapping : x ="+x+"and y ="+ y);
    }
    
}
