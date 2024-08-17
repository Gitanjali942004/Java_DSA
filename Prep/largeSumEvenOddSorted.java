package Prep;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class largeSumEvenOddSorted {

    public static int largesmallSum(int a[]){
    
        ArrayList<Integer> even=new ArrayList<>();
        ArrayList<Integer>odd=new ArrayList<>();

        for(int i=0;i<a.length;i++)
        {
            if(i%2==0)
            {
                even.add(a[i]);
            }
            else{
                odd.add(a[i]);
            }
        }
        Collections.sort(even);
        Collections.sort(odd);

      System.out.println("Even Array"+even);
       System.out.println("odd Array"+odd);
       System.out.println(even.get(even.size()-2));
        int res=odd.get(odd.size()-2)+even.get(even.size()-2);

        return res;
    }
    public static void main(String[] args) {
        int arr[]={3,6,18,2,8,1,20,9};
        System.out.println("Sum of second largest from odd and second largest from even"+largesmallSum(arr));

    }
}
