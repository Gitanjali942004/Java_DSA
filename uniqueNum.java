public class uniqueNum {
    public static void main(String[] args) {
        int[] arr={12,-13,13,-5,6,-12,-4,5,4};
        int unique=0;
        for(int i:arr){
            unique^=i;
        }
        System.out.println(unique);
    }
    
}
