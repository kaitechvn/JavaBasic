package collections.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class ListPerformanceComparison {

    private static final int SIZE = 100000; // Number of elements to test

    public static void main(String[] args) {
        // Create test data
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        Random random = new Random();

        // Populate the lists
        for (int i = 0; i < SIZE; i++) {
            int value = random.nextInt(SIZE);
            arrayList.add(value);
            linkedList.add(value);
        }

        // Measure and print performance
        System.out.println("ArrayList:");
        measurePerformance(arrayList);

        System.out.println("\nLinkedList:");
        measurePerformance(linkedList);
    }

    private static void measurePerformance(List<Integer> list) {
        // Measure insertion time at the end
        long startTime;
        long endTime;

        startTime = System.nanoTime();
        list.addFirst(999999); // Insert at the first
        endTime = System.nanoTime();
        System.out.println("Insertion time (first): " + (endTime - startTime) + " ns");

        startTime = System.nanoTime();
        list.add(list.size() / 2,999929); // Insert at the first
        endTime = System.nanoTime();
        System.out.println("Insertion time (middle): " + (endTime - startTime) + " ns");

        startTime = System.nanoTime();
        list.addLast(999999); // Insert at the first
        endTime = System.nanoTime();
        System.out.println("Insertion time (last): " + (endTime - startTime) + " ns");

        // Measure search time
        startTime = System.nanoTime();
        list.contains(list.getFirst()); // Search for the middle element
        endTime = System.nanoTime();
        System.out.println("Search first time: " + (endTime - startTime) + " ns");

        startTime = System.nanoTime();
        list.contains(list.get(list.size() / 2)); // Search for the middle element
        endTime = System.nanoTime();
        System.out.println("Search middle time: " + (endTime - startTime) + " ns");

        startTime = System.nanoTime();
        list.contains(list.getLast()); // Search for the middle element
        endTime = System.nanoTime();
        System.out.println("Search last time: " + (endTime - startTime) + " ns");

//
        // Measure deletion time
        startTime = System.nanoTime();
        list.remove(list.size() / 2); // Remove from the middle
        endTime = System.nanoTime();
        System.out.println("Deletion time (middle): " + (endTime - startTime) + " ns");

        startTime = System.nanoTime();
        list.removeLast(); // Remove from the middle
        endTime = System.nanoTime();
        System.out.println("Deletion time (last): " + (endTime - startTime) + " ns");
//    }
    }
}
