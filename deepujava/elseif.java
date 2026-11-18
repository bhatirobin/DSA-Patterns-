import java.util.*;
public class elseif {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         if(n>=75)
         {
            System.out.println("n is first devision");
         }
         else if(n>=60 && n<75)
         {
            System.out.println("n are the second devision");
         }
         else if(n>=45 && n<60)
         {
            System.out.println("n is third devision");

         }
         else{
                System.out.println("n is fail");
         }
    }
    
}
