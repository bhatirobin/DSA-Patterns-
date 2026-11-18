import java.util.*;
public class spiralmatrix{
   
public static void main(String args[])
{
    int arr[][] ={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
    int startrow=0;
        int endrow = arr.length-1;

        int startcol = 0;
        int  endcol =arr[0].length-1;
        while(startrow<=endrow && startcol<=endcol)
        {
            //top up lines
            for(int j=startcol; j<=endcol; j++)
            {
                System.out.print(arr[startrow][j]+" ");
            }
            //right side
            for(int i=startrow; i<=endrow; i++)
            {
                System.out.print(arr[i][startcol]+" ");
            }
            //bottom side
            for(int j=endcol; j<=startcol;j--)
            {
                if(startcol==endcol)
                {
                    break;
                }
                System.out.println(arr[endrow][j]+" ");
            }
            //left side
            for(int i=endrow;i<=startrow; i--)
            {
                if(startcol==endcol)
                {
                    break;
                }
                System.out.print(arr[i][startcol]+" ");
            }
            startcol++;
            startrow++;
            endcol--;
            endrow--;


        }
        System.out.println();

    }

   // spiralmatrix(arr);

}
