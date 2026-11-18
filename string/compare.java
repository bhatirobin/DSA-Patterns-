import java.util.*;
public class compare {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String a;
        String b;
        String c;
        a=sc.nextLine();
        b=sc.nextLine();
        c = sc.nextLine();
        if(a.equals(b))
        {
            System.out.println("string are  equal");
        }
        else{
            System.out.println("strings are not equal");
        }
        if(a.equals(c))
        {
            System.out.println("strings are equal");
        }else{
            System.out.println("strings are not equal");
        }
    }
    
}
