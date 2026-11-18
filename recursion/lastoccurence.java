public class lastoccurence {
    public static int lastoccurence(int arr[], int i,int key)
    {
        if(i==arr.length)
        {
            return -1;
        }
       int isfound = lastoccurence(arr, i+1, key);
       if(isfound == -1 && arr[i] == key)
       {
        return i;
       }
       return isfound;
       
    }
    public static void main(String args[])
        {
           int arr[] = {2,6,3,5,3,7,1,9,3,7};
           System.out.println(lastoccurence(arr,0, 7));
        }
    
}

    

