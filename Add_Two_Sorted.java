import java.util.ArrayList;
import java.util.Arrays;

public class Add_Two_Sorted {
    public static void main(String[] args) {
        int[] arr1={1,2,15};
        int[] arr2={6,8,10};

        ArrayList<Integer> merged=new ArrayList<>();
        int i=0;
        int j=0;
        while(i<arr1.length && j<arr2.length)
        {
            if(arr1[i]<arr2[j])
            {
                merged.add(arr1[i]);
                i++;
            }
            else{
                merged.add(arr2[j]);
                j++;
            }
        }

        while(i<arr1.length)
        {
            merged.add(arr1[i]);
            i++;
        }
        while(j<arr2.length)
        {
            merged.add(arr2[j]);
            j++;
        }

      System.out.println(merged);

    }
}
