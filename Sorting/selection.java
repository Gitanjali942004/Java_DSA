import java.util.Arrays;

public class selection {
    public static void main(String[] args) {
        int[] arr={8,7};
        selection_sort(arr);
    }
    static void selection_sort(int[] a)
    {
        int temp;
        
        for(int i=0;i<a.length;i++)
        {
            int last=a.length-i-1;
            int maxindex=0;

            for(int j=0;j<=last;j++)
            {
                if(a[j]>a[maxindex]){
                    maxindex=j;
                }
            }
            
           temp=a[maxindex];
           a[maxindex]=a[last];
           a[last]=temp;
        }
       System.out.println(Arrays.toString(a));
    }
}
