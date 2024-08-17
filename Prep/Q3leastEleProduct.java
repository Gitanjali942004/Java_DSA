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
        Arrays.sort(arr);

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
