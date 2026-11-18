import java.util.*;
public class even2 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
            String ans;
        ans =  ( n%2 == 0) ? "n number is even ":"n nuber is odd number";

        System.out.println(ans);
    }
    
}
