import java.util.*;
public class palindrom {
    public static boolean palindrom(String ab)
    {
        for(int i=0; i<ab.length()/2; i++)
        {
            int n = ab.length();
           // if(ab(i)==ab(ab-i-1))
           if(ab.charAt(i) != ab.charAt(n-i-1))
           {
             
            return false;

           }
        }
        return true;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String ab;
        ab = sc.nextLine();

       
        System.out.println( palindrom(ab));

    }
    
}
