public class custom_stack {
    private static final int Default_size=10;
    public static int data[]=new int[Default_size];
    static int top=-1;
    public static void push(int val)
    {
       top++;
       data[top]=val;
    }
    public static void pop()
    {
        top--;
    }

    public static void main(String[] args) {
        
    }
}
