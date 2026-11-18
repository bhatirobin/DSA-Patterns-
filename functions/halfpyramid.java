/*class main{
    public static void main(String args[]){
        int line = 4;
        for(int i=1; i<=line; i++){
            for(int j=1; j<=line-i+1; j++){
                System.out.print(" ");
            }
        for(int j=1; j<=i; j++){
            System.out.print("*");
        }
    System.out.println();    
    }
    }
}*/
import java.util.*;
public class halfpyramid
{
    public static void halfp(int line)
    {
        for(int i=1; i<=line; i++)
        {
            for(int j=1; j<=line-i; j++ )
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String args[]) {
        halfp(4);
        
    }
}