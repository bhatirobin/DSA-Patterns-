import java.util.*;
public class multiple2 {
    
        public static void multiple(int r, int k)
        {
            //here are create the base case

            if(k == 0)
            {
                System.out.println(r);
                  return ;
            }
            //here are make a recursive problem solving
            multiple(r, k-1);

            //here are make the self work are using recursion
            System.out.println(r*k);
        }
    

    public static void main(String args[])
       {
        //int r,k;

        multiple(3, 8);
       }    
}
