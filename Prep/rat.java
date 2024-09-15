//Problem Description :
// The function accepts two positive integers ‘r’ and ‘unit’ and a positive integer array ‘arr’ of size ‘n’ as its argument ‘r’ represents the number of rats present in an area, ‘unit’ is the amount of food each rat consumes and each ith element of array ‘arr’ represents the amount of food present in ‘i+1’ house number, where 0 <= i

// Note:

// Return -1 if the array is null
// Return 0 if the total amount of food from all houses is not sufficient for all the rats.
// Computed values lie within the integer range.
// Example:

// Input:

// r: 7
// unit: 2
// n: 8
// arr: 2 8 3 5 7 4 1 2
// Output: 4
package Prep;
import java.util.Scanner;

public class rat {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);

      System.out.println("r:");
      int r=sc.nextInt();

      System.out.println("unit:");
      int unit=sc.nextInt();

      System.out.println("n:");
      int n=sc.nextInt();

      int[] arr=new int[n];
      System.out.println("Enter Array Elements:");
      for(int i=0;i<n;i++)
      {
         arr[i]=sc.nextInt();
      }

     int res=findHomeAccount(r,unit,arr);
     System.out.println("Result:"+res);

    }
    public static int findHomeAccount(int r,int unit,int[] arr)
    {
            int foodrequired=r*unit;
            int availablefood=0;
            if(arr.length==0)
            {
                return -1;
            }
            for(int i=0;i<arr.length;i++)
            {
                if(availablefood>=foodrequired)
                {
                    return i;
                }
                else
                {
                    availablefood+=arr[i];
                }
            }
        return 0;
    }
}
