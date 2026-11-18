public class firstoccurence 
{
       
    public static int firstoccur(int arr[], int i,int key)
    {
        if(i == arr.length)
        {
            return -1;
        }
      //  int key =  ;
        if(arr[i]==key)
        {
            return i;
        }
        return firstoccur(arr,i+1,key);
    
    }
    public static void main(String args[])
        {
           int arr[] = {2,6,3,5,3,7,1,9,3,7};
           System.out.println(firstoccur(arr, 0, 7));
        }
    
}
