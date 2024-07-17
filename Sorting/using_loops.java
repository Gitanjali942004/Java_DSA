import java.util.Arrays;

public class using_loops {
    public static void main(String args[])
    {
        int[] arr={10,9,20,11,45,30,35,12,90,14};
        int temp;

        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]>arr[j])
                {
                    temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
        }
        System.out.println("Sorted Array:"+Arrays.toString(arr));

    }
}
