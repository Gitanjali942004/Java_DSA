public class swap_without_third_var {
    public static void main(String[] args) {
        int a=20,b=40;
        System.out.println("Before Swapping: A and B:"+a+" "+b);

         a=a+b;
         b=a-b;
         a=a-b;
         System.out.println("After Swapping: A and B:"+a+" "+b);
    }
}
