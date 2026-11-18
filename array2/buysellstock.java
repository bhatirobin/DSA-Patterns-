import java.util.*;
public class buysellstock {
    public static int buysell(int price[])
    {
        int n =price.length;
        int buying = Integer.MAX_VALUE;
        int maxprofit =Integer.MIN_VALUE;
        for(int i=0; i<n; i++)
        {
            if(buying < price[i])
            {
                 int profit = price[i]-buying;
                 maxprofit = Math.max(maxprofit,profit);
            }
            else{
                buying = price[i];
            }
        }
        return maxprofit;
    }
    public static void main(String args[]) {
        int price[] = {7,1,5,3,6,4};
        System.out.println(buysell(price));
    }
    
}
