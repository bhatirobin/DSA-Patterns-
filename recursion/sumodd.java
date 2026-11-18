import java.util.*;
public class sumodd {
            public static int sumodd(int n)
            {
                // here are make the first base case
                if(n == 0)
                {
                    return n;
                }
                //here are make the  smaller  in this problem
                if(n%2 == 0)
                {
                    //here a declare the first self work in this program
                    int even = sumodd(n-1)-n;

                    return even;
                    
                }
                else
                {
                       // here are create the second self work in this program
                        int odd = sumodd(n-1) + n;
                    return odd;             
                }
            
            }
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
               
            int n = sc.nextInt();
          //function calling
            System.out.println(sumodd(n));

        }
}
