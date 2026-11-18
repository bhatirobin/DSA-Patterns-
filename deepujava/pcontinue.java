import java.util.*;
public class pcontinue {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    

    do{
        System.out.print("enter your value");
        int n = sc.nextInt();
        if(n%4==0)
        {
            continue;
        }
        
        System.out.println("number was:"+ n);
    } while(true);

   }   
}
