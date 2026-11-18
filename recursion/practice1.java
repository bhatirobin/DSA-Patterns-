import java.util.*;
public class practice1{

    public static int print(int a)
    {
        if(a == 0)
        {
            System.out.println(a);
            return 1;
        }
        System.out.println(a);
         print(a-1);
            return a;
        }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
      //  System.out.println(print(a));
       print(a);
    }
}