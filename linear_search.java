public class linear_search {
    public static void main(String[] args) {
        int  arr[]=new int[10];
        arr=new int[]{10,20,30,40,50,60,70,80,90,100};

        int sear_ele=40;
        for(int i=0;i<arr.length;i++) {
            if(arr[i]==sear_ele)
            {
               System.out.println("Element Present at index "+i);
            }
        }
    }
}
