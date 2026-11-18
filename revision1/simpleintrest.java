import java.util.*;
public class simpleintrest 
{
    public static void main(String args[])
    {
        Scanner vr = new Scanner(System.in);


        int price = vr.nextInt();
        int rate = vr.nextInt();
        int time = vr.nextInt();


        int SI = (price*rate*time)/100;

        System.out.println("simple intrest is this="+ SI);
    }
    
}
