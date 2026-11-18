import java.util.*;
public class hollowp {
    public static void hollowp(int row, int col)
    {
        
        for(int i=1; i<=row; i++){
            for(int j=1; j<=col; j++){
                if(i==1 || i== 4 || j==1 || j==5){
                    System.out.print("*");
                }
            else{
                System.out.print(" ");
            }
            }
        System.out.println();
        }
    }
    public static void main(String args[]) {
       hollowp(4, 5); 
    }
    
}
