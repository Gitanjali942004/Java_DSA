public class bubble {
    public static void main(String[] args) {
        int[] arr={12,2,45,20,86,1};
        bubble_sort(arr);
        
    }

    static void bubble_sort(int[] a)
    {
        int len=a.length;

        for(int i=0;i<len-1;i++)
        {
            for(int j=0;j<len-1;j++)
            {
                if(a[j]>a[j+1])
                {
                    a[j]=a[j]+a[j+1];
                    a[j+1]=a[j]-a[j+1];
                    a[j]=a[j]-a[j+1];
                }
            }
        }
        for(int j=0;j<len;j++)
        {
           System.out.println(a[j]);
        }
    }
}
