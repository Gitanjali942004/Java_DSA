class RunnableThread1 implements Runnable{

    @Override
    public void run() {
        int i=0;
        while(i<1000)
        {
            System.out.println("Thread1");
            i++;
        }
    }  
}

class RunnableThread2 implements Runnable{
    @Override
    public void run(){
        int i=0;
        while(i<1000)
        {
            System.out.println("Thread2");
            i++;
        }
        
    }
}
public class ByImplementRunnable {
    public static void main(String[] args) {
        RunnableThread1 b1=new RunnableThread1();
        Thread t1=new Thread(b1);
        t1.start();

        RunnableThread2 b2=new RunnableThread2();
        Thread t2=new Thread(b2);
        t2.start();



    }
}
