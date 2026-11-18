import java.util.*;
public class btodecimal {
    public static void btodecimal(int binnum)
    {
        int pow =0;
        int dec = 0;
        while(binnum>0)
        {
            int lastdigit = binnum%10;
            dec = dec+(lastdigit*(int)Math.pow(2, pow));
            pow++;
            binnum = binnum/10;
        }
        System.out.println("decimal of " + binnum +" = " +dec);
    }
    public static void main(String args[]) {
       // System.out.println(btodecimal(101)));
       btodecimal(101);
    }

    
}
