import java.util.*;
public class linearsearch {
    public static int lsearch(int marks[], int key)
    {
        for(int i=0; i<marks.length;i++)
        {
                if(marks[i]==key)
                {
                    return i;
                }
                
        }
        return -1;
    }
public static void main(String[] args) {
    int marks[]={2,45,54,21,34,76,16};
    int key =21;
    int index=lsearch(marks, key);
    if(index==-1)
    {
        System.out.println("not found this number");
    }
    else{

    
    System.out.println("key is at index" +" " + index);
    }
   // for(int i=0; i<marks.length; i++)
    
    //    if(marks[i] ==)
    
}    
}
