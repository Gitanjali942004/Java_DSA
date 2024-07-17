public class bin_search {
    public static void main(String args[])
    {
        int arr[]={1,2,3,4,5,6,7,8,9,10};
        System.out.println("Element found at location :"+binary_Search(arr,8));

       
    }

    static int binary_Search(int a[],int t)
    {

       int start=0;
       int end=a.length-1;

       while(start<=end)
       {
        int mid=(start+end)/2;
         if(a[mid]==t)
         {
            return mid;
         }
         else if(a[mid]>t)
         {
              end=mid-1;
         }
         else 
         {
            start=mid+1;
            
         }
       }
       return -1;
    }
}
