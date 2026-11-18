import java.util.*;
public class compression {
    public static String compress(String r)
    {
        String newr ="";
       // Integer count;
        StringBuilder sb = new StringBuilder("");
        for(int i=0; i<r.length(); i++ )
        {
           Integer count =1;
            while(i<r.length()-1 && r.charAt(i)==r.charAt(i+1))
            {
                count++;
                i++;
            }
            newr +=r.charAt(i);
            if(count>1)
            {
                newr += count.toString(i);
            }
        } 
        return newr;
    }
    public static void main(String args[])
    {
        String r ="kkkuuuunnaaallll";
        System.out.println(compress(r));
    }
    
}
