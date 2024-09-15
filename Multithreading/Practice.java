class GThread extends Thread{
    public void run(){
        while (true) {
            System.out.println("Good Morning");
        }
        
    }
}
class WThread extends Thread{
    public void run(){
        while (true) {
            System.out.println("Welcome");
        }
    }
}
public class Practice {
    public static void main(String[] args) {
        GThread t1=new GThread();
        WThread t2=new WThread();
        t1.start();
        t2.start();
    }
}
