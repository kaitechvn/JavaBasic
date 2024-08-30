package collections.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

@SuppressWarnings("ALL")
public class MapPerformanceTest {

    private static final int NUM_OPERATIONS = 10000000;

    public static void main(String[] args) {
        // Test insertion time
        System.out.println("Testing insertion time...");
        double hashMapInsertionTime = testInsertion(new HashMap<>()) / 1_000_000_000.0;
        double linkedHashMapInsertionTime = testInsertion(new LinkedHashMap<>()) / 1_000_000_000.0;

        System.out.println("HashMap insertion time: " + hashMapInsertionTime + " seconds");
        //noinspection StringTemplateMigration
        System.out.println("LinkedHashMap insertion time: " + linkedHashMapInsertionTime + " seconds");

        // Test retrieval time
        System.out.println("\nTesting retrieval time...");
        double hashMapRetrievalTime = testRetrieval(new HashMap<>()) / 1_000_000_000.0;
        double linkedHashMapRetrievalTime = testRetrieval(new LinkedHashMap<>()) / 1_000_000_000.0;

        System.out.println("HashMap retrieval time: " + hashMapRetrievalTime + " seconds");
        System.out.println("LinkedHashMap retrieval time: " + linkedHashMapRetrievalTime + " seconds");

        // Test deletion time
        System.out.println("\nTesting deletion time...");
        double hashMapDeletionTime = testDeletion(new HashMap<>()) / 1_000_000_000.0;
        double linkedHashMapDeletionTime = testDeletion(new LinkedHashMap<>()) / 1_000_000_000.0;

        System.out.println("HashMap deletion time: " + hashMapDeletionTime + " seconds");
        System.out.println("LinkedHashMap deletion time: " + linkedHashMapDeletionTime + " seconds");
    }

    private static long testInsertion(Map<Integer, String> map) {
        long startTime = System.nanoTime();

        for (int i = 0; i < NUM_OPERATIONS; i++) {
            map.put(i, "Value" + i);
        }

        long endTime = System.nanoTime();
        return endTime - startTime;
    }

    private static long testRetrieval(Map<Integer, String> map) {
        // First, fill the map
        for (int i = 0; i < NUM_OPERATIONS; i++) {
            map.put(i, "Value" + i);
        }

        long startTime = System.nanoTime();

        for (int i = 0; i < NUM_OPERATIONS; i++) {
            map.get(i);
        }

        long endTime = System.nanoTime();
        return endTime - startTime;
    }

    private static long testDeletion(Map<Integer, String> map) {
        // First, fill the map
        for (int i = 0; i < NUM_OPERATIONS; i++) {
            map.put(i, "Value" + i);
        }

        long startTime = System.nanoTime();

        for (int i = 0; i < NUM_OPERATIONS; i++) {
            map.remove(i);
        }

        long endTime = System.nanoTime();
        return endTime - startTime;
    }
}
