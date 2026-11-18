import java.util.*;
        class main{


          public static void number(int n){
        if(n==1){
          System.out.println(n);
        return;
          }
            number(n-1);
            System.out.println(n);
        //   return;
          }
          
          
          public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            number(n);

          }
        }