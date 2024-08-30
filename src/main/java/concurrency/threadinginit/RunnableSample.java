package concurrency.threadinginit;

public class RunnableSample implements Runnable{

    @Override
    public void run() {
        System.out.println("threading is running");
    }

    public static void main(String[] args) {
        RunnableSample runnableSample = new RunnableSample();
        Thread t1 = new Thread(runnableSample);
        t1.start();
    }
}
