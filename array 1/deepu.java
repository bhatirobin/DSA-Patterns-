import java.util.*;
class main{
    public static void main(String args[]){
        int[] a={2,4,6,8,10,12,14};
        int key =10;
        int start = 0;
        int end = a.length-1;
        int mid;
         
        while(start <= end){
            mid = (start + end )/2;

            if(a[mid] == key){
                System.out.println(end);
            }
        if(a[mid] < key){
            start = mid+1;
        }
       else{
        end=mid-1;
       } 
    }

    }
}