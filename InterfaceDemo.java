abstract class demo{
    public void demo1(){
        System.out.println("Hello");
    }
}
public class InterfaceDemo extends demo {
    public static void main(String[] args) {
        InterfaceDemo i=new InterfaceDemo();
        i.demo1();
    }
}
