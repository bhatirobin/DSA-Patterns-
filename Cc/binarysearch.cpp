#include<iostream>
using namespace std;
int binarysearch(int arr[],int n,int key)
{ 
    int s=0;
    int end =n;
    while(s<=end)
    {
        int mid=(s+end)/2;
        

       if (arr[mid]==key)
        {
return mid;
        }
        else if(arr[mid]>key)
        {
            end=mid-1;
        }
        else{
            s=mid+1;
        }
    }
    return -1;
   /* for(int i=0;i<n;i++)
    {
        if(arr[i]==key)
        {
            return i;
        }
    }
    return -1;*/
}
     int main()
{
    int n;
    cin>>n;
    int arr[n];
    for(int i=0;i<n;i++)
    {
        cin>>arr[i];
    }
    int key;
    cin>>key;
    cout<<binarysearch(arr,n,key)<<endl;
    return 0;

}