package concurrency.synchronize.bank;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListExample {
    public static void main(String[] args) throws InterruptedException {
        // Create a CopyOnWriteArrayList
        List<String> list = new CopyOnWriteArrayList<>();

        // Add initial elements
        list.add("A");
        list.add("B");
        list.add("C");

        // Create a Runnable that adds elements to the list
        Runnable listOperations = () -> {
            for (int i = 0; i < 3; i++) {
                list.add(Thread.currentThread().getName() + " added: " + i);
                System.out.println(Thread.currentThread().getName() + " added: " + i);
            }
        };

        // Create and start two threads
        Thread thread1 = new Thread(listOperations, "Thread-1");
        Thread thread2 = new Thread(listOperations, "Thread-2");
        thread1.start();
        thread2.start();

        // Wait for both threads to finish
        thread1.join();
        thread2.join();

        // Print the final list
        System.out.println("Final list: " + list);
    }
}
