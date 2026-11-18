import java.util.*;
public class arr9 
{
    static int search(int key)
    {
        
        int arr[] ={4,6,55,78,34,64,16,95};

        for(int i=0; i<arr.length; i++)
        {
            if(key == arr[i])
            {
                 key = i;
                 break;
    //break se key milne pr itreation vahi pr ruk jayengi
    //chahe key array mei aage bhi kyu na ho 
    //output mei first find index aayega hmesha
            }
           // System.out.println("the key is found at index="+key);

        }
        
        System.out.println("the key is found at index="+key);

        return key;
        
    }
    public static void main(String[] args) 
    {
        search(78);
        
    }
    
}
