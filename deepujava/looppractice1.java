import java.util.*;
public class looppractice1 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int number;
        int choice ;
        int evensum =0;;
        int oddsum =0;
        do{
            System.err.println("enter the value of number");
            number = sc.nextInt();
              
            if(number%2 ==0 )
            {
                evensum+=number;
            }
            else
            {
                oddsum+=number;
            }
            System.out.println("do you want to continue this statement");
            choice = sc.nextInt();
        }while(choice==1);
        System.out.println("sum of evenintegers:" + evensum);
        System.out.println("sum of oddintegers:" + oddsum);

    }    
}
