import java.util.*;
  public class recursion
  {
     public static void decreasing(int n)
     {
        if(n==1)
        {
           System.out.println(n);
           return;
            
        }
        System.out.println(n + " ");
        decreasing(n-1);
     }
    public static void main(String args[])
        {
            Scanner s = new Scanner(System.in);
            int n = s.nextInt();
            decreasing(n);

        }
  }