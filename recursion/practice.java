import java.util.*;
   public class practice
   {
    public static int sum(int sum)

    {
        if(sum == 0)
        {
            return 0;
        }
        int sofn = sum(sum);
        int s = sum + sum(sum -1);
        return s;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int sum = sc.nextInt();
        System.out.println(sum(sum));
    }
   }