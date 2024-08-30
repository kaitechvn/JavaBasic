package concurrency.threadinginit;

public class ThreadSample extends Thread {

    @Override
    public void run(){
        System.out.println("thread is running");
    }

    public static void main(String args[]) {
        ThreadSample t1 = new ThreadSample();
        t1.start();
    }
}
