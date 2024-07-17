public class order_agnostic_search {
    public static void main(String args[])
    {
       // int arr[]={1,2,3,4,5,5,6,7,8};
       int arr[]={8,7,6,5,4,3,2,1};

        System.out.println("Element found at location :"+binary_Search(arr,3));
    }

    static int binary_Search(int a[],int t)
    {
       int start=0;
       int end=a.length-1;
       boolean asce=a[start]<a[end];
       while(start<=end)
       {
        int mid=(start+end)/2;
         if(a[mid]==t)
         {
            return mid;
         }
         if(asce)
         {
            if(a[mid]>t)
            {
              end=mid-1;
            }
            else 
            {
             start=mid+1;
            }
         }
         else
         {
            if(a[mid]<t)
            {
              end=mid-1;
            }
            else 
            {
             start=mid+1;
            }
         }
          
       }
       return -1;
    }
}
