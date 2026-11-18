import java.util.*;
public class arear2 
{
    public static void main(String[] args) 
    {
       Scanner sc = new Scanner(System.in);
       
       System.out.println("enter the value of length");

       int length = sc.nextInt();

       System.out.println("enter the value of breath");

       int breath = sc.nextInt();

       int area = length * breath;

       int perimeter = 2*(length + breath);

       if(area > perimeter)
       {
        System.out.println("are is greater than perimeter");
       }
       else{
        System.out.println("perimeter is greater than area");
       }
       if(perimeter== area)
       {
        System.out.println("area and perimeter are to be equal");
       }
        
    }
    
}
