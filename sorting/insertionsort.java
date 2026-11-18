import java.util.*;
public class insertionsort {
    public static void insertion(int n[])
    {
        int temp;
        int j;
        for(int i=1; i<n.length; i++)
        {
            temp = n[i];
            j=i;
            while(j>0 && n[j-1]>temp)
            {
                n[j]= n[j-1];
                j =j-1;
            }
            n[j] =temp;
        }
        for(int i=0; i<n.length; i++)
        {
            System.out.println(n[i] +" ");
        }
    }
        public static void main(String[] args) {
          //  Scanner sc = new Scanner(System.in);
            //int a = sc.nextInt();
            //int n[] = new int[a];
            int n[] ={5,1,6,2,4,3};
            insertion(n);

        }    
}
