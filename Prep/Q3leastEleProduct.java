// Implement the following Function

// def ProductSmallestPair(sum, arr)

// The function accepts an integers sum and an integer array arr of size n. Implement the function to find the pair, (arr[j], arr[k]) where j!=k, Such that arr[j] and arr[k] are the least two elements of array (arr[j] + arr[k] <= sum) and return the product of element of this pair

// NOTE

// Return -1 if array is empty or if n<2
// Return 0, if no such pairs found
// All computed values lie within integer range
// Example

// Input

// sum:9

// size of Arr = 7

// Arr:5 2 4 3 9 7 1

// Output

// 2

// Explanation

// Pair of least two element is (2, 1) 2 + 1 = 3 < 9, Product of (2, 1) 2*1 = 2. Thus, output is 2

// Sample Input

// sum:4

// size of Arr = 6

// Arr:9 8 3 -7 3 9

// Sample Output

// -21

package Prep;

import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
import java.io.*;

public class Q3leastEleProduct {

    public static int ProductSmallestPair(int s, int arr[]) 
    {
        if(arr.length<2){
            return -1;
        }
        // Arrays.sort(arr);
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]>arr[j])
                {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }

            }
        }


        if((arr[0]+arr[1]<=s)){
            return (arr[0]*arr[1]);
        }
      
        return 0;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter Sum:");
        int s=in.nextInt();
        int a[]= {1,4,5,12,2,9};

        System.out.println("Product of pair is"+ProductSmallestPair(s, a) );

    }
}
