package concurrency.synchronize.method;

import concurrency.synchronize.method.Counter;

public class MyThread extends Thread {
    Counter counter;

    MyThread(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++){
            counter.increment();
            try {
                Thread.sleep(10); // Adding sleep to better observe the thread execution
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
