package Binary_Search_Interview_Q;

public class ceiling_of_num {

    public static void main(String[] args) {
        int[] arr={10,20,30,40,50,60,70,80};
        int target=18;
    
        int ceiling=find_ceiling(arr,target);
        System.out.println("Ceiling No is "+ceiling);
    }

    private static int find_ceiling(int[] arr, int target) {
     
        int start=0;
        int end=arr.length;
        int mid=(start+end)/2;

        while (start<=end) {
             mid=(start+end)/2;
            if(arr[mid]==target)
            {
                return arr[mid];
            }
            else if(target>arr[mid])
            {
                start=mid+1;
                
            }
            else
            {
                end=mid-1;
            }
        }
      return arr[start];
    }    
}
