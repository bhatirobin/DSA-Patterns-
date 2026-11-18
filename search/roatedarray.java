public class roatedarray 
{
    public static int search(int arr[], int s, int e, int key)
            {

                if(s > e)
                {
                    return -1;
                }
                int mid = (s+e)/2;

                     if(arr[mid] == key)
                     {
                        return mid;
                     }


                     // case 1 the mid of part 1
                     if(arr[s] <= arr[mid])
                     {
                        //case a
                        if(arr[s] <= key && key <= arr[mid])
                        {
                           return search(arr, s, mid-1, key);

                        }
                        //case b
                        else{
                           return search(arr, mid+1, e, key);
                        }

                     }



                     //the case 2 mid of part 2
                     else
                      {

                        if(arr[mid] <= key && key <= arr[e])
                        {
                            return search(arr, mid+1, e, key);
                        }
                        else
                        {
                          return search(arr, s, mid-1, key);
                        }

                    }
            }
   public static void main(String args[])
        {
        
           int arr[] = {4,5,6,77,0,1,2};

        

        System.out.println(search(arr, 0, arr.length-1, 0));

        


        } 
}
