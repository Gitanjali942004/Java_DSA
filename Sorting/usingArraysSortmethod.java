// import java.util.Arrays;
// import java.util.Collections;

// public class usingArraysSortmethod {
//     public static void main(String[] args) {
//         int[] arr={10,9,20,11,45,30,35,12,90,14};

//         Arrays.sort(arr,Collections.reverseOrder());
//         Arrays.sort(arr, Collections.reverseOrder());
//         System.out.println("Sorted Array[]:"+Arrays.toString(arr));
//         System.out.printf("Modified arr[] : %s",Arrays.toString(arr));
//     }
// }


import java.util.Arrays;
import java.util.Collections;

public class usingArraysSortmethod  {
    public static void main(String[] args)
    {
        // Note that we have Integer here instead of
        // int[] as Collections.reverseOrder doesn't
        // work for primitive types.
        Integer[] arr = { 13, 7, 6, 45, 21, 9, 2, 100 };

        // Sorts arr[] in descending order
        Arrays.sort(arr, Collections.reverseOrder());

        System.out.printf("Modified arr[] : %s",
                          Arrays.toString(arr));
    }
}