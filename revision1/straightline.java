import java.util.*;
public class straightline 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        int x1 = 1,y1 = 1, x2 = 2 , y2 = 2, x3 = 3, y3 = 3;

        double m1 , m2;

        m1 = (y2-y1)/(x2-x1);
        m2 = (y3-y2)/(x3-x1);

        if(m1 == m2)
        {
            System.out.println("the three points lie on one straight line");
        }
        else
        {
            System.out.println("the three points are not lie in one straight line");
        }
        
    }
    
}
