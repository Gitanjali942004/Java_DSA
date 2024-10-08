// You are given a function,
// int findCount(int arr[], int length, int num, int diff);

// The function accepts an integer array ‘arr’, its length and two integer variables ‘num’ and ‘diff’. Implement this function to find and return the number of elements of ‘arr’ having an absolute difference of less than or equal to ‘diff’ with ‘num’.
// Note: In case there is no element in ‘arr’ whose absolute difference with ‘num’ is less than or equal to ‘diff’, return -1.

// Example:
// Input:

// arr: 12 3 14 56 77 13
// num: 13
// diff: 2
// Output:
// 3

// Explanation:
// Elements of ‘arr’ having absolute difference of less than or equal to ‘diff’ i.e. 2 with ‘num’ i.e. 13 are 12, 13 and 14.
package Prep;

import java.util.Scanner;

public class FindCountArrayDiff {


    private static int findCount(int[] arr, int num, int diff) {
        int count=0;

        for (int i : arr) {
            if(Math.abs((i-num))<=diff)
            {
                count++;
            }
        }
        if(count==0)
        {
            return -1;
        }
       return count;
    }

    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         int[] arr=new int[6];
         System.out.println("Array Elements:");
         for(int i=0;i<arr.length;i++)
         {
            arr[i]=sc.nextInt();
         }
         System.out.print("num:");
         int num=sc.nextInt();
         System.out.print("diff:");
         int diff=sc.nextInt();

         int res=findCount(arr,num,diff);

         System.out.println("Output"+res);

         

    }

    
}

