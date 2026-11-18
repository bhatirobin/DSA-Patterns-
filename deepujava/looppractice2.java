import java.util.*;
public class looppractice2 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enetr the value of factorial");
        int factorial =1;
        int num = sc.nextInt();
        for( int i=1; i<=num;i++)
        {
            factorial *=i;
        }
        System.out.println("factorial:" + factorial);
     }    
}
