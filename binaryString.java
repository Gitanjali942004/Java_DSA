public class binaryString {
    public static void main(String args[]){
        String a="101";
        String b="1001";
        int c=Integer.parseInt(a,2)+Integer.parseInt(b,2);
        System.out.println(Integer.toBinaryString(c));
        System.out.println();
    }
    
}
