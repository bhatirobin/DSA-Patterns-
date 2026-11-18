import java.util.*;
public class pairarr {
    public static void pair(int numb[])
    {
        int total =0;
        for(int i=0; i<numb.length; i++){
        int curr = numb[i];
        for(int j=i+1; j<numb.length; j++)
        {
            System.out.print("(" + curr + "," + numb[j] + ") ");
            total++;
        }
        System.out.println();
    }
    System.out.println("total pair is :" + total);
}
    public static void main(String args[]) {
        int numb[] = {2,3,4,5,6,7,8};
        pair(numb);


        
        
    }
    
}
