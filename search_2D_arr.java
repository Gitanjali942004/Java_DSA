import java.util.Arrays;

public class search_2D_arr {
    public static void main(String[] args)
    {
        int [][] arr={
            {1,2,3},
            {4,5,6},
            {7,8,9},
            {10,11,12}
        };
        
        int target=9;
        
        int ans[]=search_2D(arr,target);
        System.out.println(Arrays.toString(ans));
      
    }
    static int[] search_2D(int arr[][],int target){
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                if(target==arr[i][j])
                {
                    return new int[]{i,j};
                    
                }  
            }
        }
        return new int[] {-1,-1};
}
       
    }

