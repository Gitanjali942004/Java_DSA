public class _1_rev_array 
{
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        
        for(int i=0;i<arr.length/2;i++)
        {
            int temp=arr[i];
            arr[i]=arr[arr.length-i-1];
            arr[arr.length-i-1]=temp;

        }

        for (int i : arr) {
            System.out.println(i);
        }

    }  
}
