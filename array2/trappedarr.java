import java.util.*;
public class trappedarr {
    public static int trappedrainwater(int height[])
    {
        int n= height.length;
        //calculate left max boundary - array
        int leftmax[] = new int[n];
        leftmax[0] = height[0];
        for(int i=1;i<n; i++)
        {
            leftmax[i] = Math.max(height[i] , leftmax[i-1]);
        }
        //calculate the right max boundry
        int rightmax[] = new int[n];
        rightmax[n-1] = height [n-1];
        for(int i=n-2; i>=0; i--)
        {
            rightmax[i] = Math.max(height[i],rightmax[i+1]);
        }
        int trappedwater =0;
        //loop
          for(int i=0; i<n; i++)
          {
            //waterlevel = min(leftmax bound, right max bound)
            int waterlevel = Math.min(leftmax[i], rightmax[i]);
            //trapped water = wa height[i]
             trappedwater += waterlevel - height[i];
          }
          return trappedwater;
        
    }
    public static void main(String args[]) {
        int height[] = {6,3,0,8,4,2,7};
        
        System.out.println(trappedrainwater(height));
    }
    
}
