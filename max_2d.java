import java.util.Arrays;

public class max_2d {
      public static void main(String[] args)
    {
        int [][] arr={
            {1,2,3},
            {4,5,6},
            {7,8,9},
            {10,11,12}
        };
        
      
        
        int ans=max_2D(arr);
        System.out.println(ans);
      
    }
    static int max_2D(int arr[][]){
        int max=arr[0][0];
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                if(arr[i][j]>max)
                {
                   max=arr[i][j];
                    
                }  
            }
        }
        return max;
}
      
}
