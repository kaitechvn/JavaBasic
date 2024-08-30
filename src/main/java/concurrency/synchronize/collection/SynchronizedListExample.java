package concurrency.synchronize.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SynchronizedListExample {
    public static void main(String[] args) throws InterruptedException {
        // Create a non-thread-safe list
        List<Integer> list = new ArrayList<>();

        // Wrap the list with a synchronized (thread-safe) list
        List<Integer> syncList = Collections.synchronizedList(list);

        // Create a Runnable that adds elements to the list
        Runnable listOperations = () -> {
            for (int i = 0; i < 1000; i++) {
                syncList.add(i);
                System.out.println(Thread.currentThread().getName() + " added: " + i);
            }
        };

        // Create and start two threads
        Thread thread1 = new Thread(listOperations);
        Thread thread2 = new Thread(listOperations);
        thread1.start();
        thread2.start();

        // Wait for both threads to finish
        thread1.join();
        thread2.join();

        // Print the size of the list
        System.out.println("Size of synchronized list: " + syncList.size());
    }
}
