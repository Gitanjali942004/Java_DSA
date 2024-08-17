public class find_ith_bit {
    public static void main(String[] args) {
        int num=0b100110111;
        int bit=4;
       System.out.println((num & (1<<(bit-1)))>>(bit-1)); 
    }
    
}
