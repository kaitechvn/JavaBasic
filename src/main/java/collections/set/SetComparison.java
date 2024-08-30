package collections.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetComparison {

    public static void main(String[] args) {
        // Initialize HashSet and LinkedHashSet
        Set<String> hashSet = new HashSet<>();
        Set<String> linkedHashSet = new LinkedHashSet<>();

        // Add elements and time the operations
        String[] elements = {"banana", "apple", "orange", "mango", "grape"};

        long startTime, endTime;

        System.out.println("Adding elements to HashSet:");
        startTime = System.nanoTime();
        for (String element : elements) {
            hashSet.add(element);
            hashSet.add(element); // Try to add duplicate
        }
        endTime = System.nanoTime();
        System.out.println("Time taken for adding elements to HashSet: " + (endTime - startTime) + " ns");

        System.out.println("\nAdding elements to LinkedHashSet:");
        startTime = System.nanoTime();
        for (String element : elements) {
            linkedHashSet.add(element);
            linkedHashSet.add(element); // Try to add duplicate
        }
        endTime = System.nanoTime();
        System.out.println("Time taken for adding elements to LinkedHashSet: " + (endTime - startTime) + " ns");

        // Print elements to check the order
        System.out.println("\nOrder of elements in HashSet:");
        printSet(hashSet);

        System.out.println("\nOrder of elements in LinkedHashSet:");
        printSet(linkedHashSet);

        // Check if specific elements exist
        System.out.println("\nChecking existence of 'apple' in both sets:");
        checkElementExistence(hashSet, "apple");
        checkElementExistence(linkedHashSet, "apple");

        // Time the removal of an element
        System.out.println("\nRemoving 'orange' from both sets:");
        startTime = System.nanoTime();
        hashSet.remove("orange");
        endTime = System.nanoTime();
        System.out.println("Time taken for removing element from HashSet: " + (endTime - startTime) + " ns");

        startTime = System.nanoTime();
        linkedHashSet.remove("orange");
        endTime = System.nanoTime();
        System.out.println("Time taken for removing element from LinkedHashSet: " + (endTime - startTime) + " ns");

        System.out.println();
        int numberOfElements = 1000000;

        Set<Integer> hashSet2 = new HashSet<>();
        Set<Integer> linkedHashSet2 = new LinkedHashSet<>();
        // Time adding elements to HashSet
        startTime = System.nanoTime();
        for (int i = 0; i < numberOfElements; i++) {
            hashSet2.add(i);
        }
        endTime = System.nanoTime();
        System.out.println("Time taken to add " + numberOfElements + " elements to HashSet: " + (endTime - startTime) + " ns");

        // Time adding elements to LinkedHashSet
        startTime = System.nanoTime();
        for (int i = 0; i < numberOfElements; i++) {
            linkedHashSet2.add(i);
        }
        endTime = System.nanoTime();
        System.out.println("Time taken to add " + numberOfElements + " elements to LinkedHashSet: " + (endTime - startTime) + " ns");

    }

    // Method to print elements in a set
    private static void printSet(Set<String> set) {
        for (String element : set) {
            System.out.println(element);
        }
    }

    // Method to check if a set contains a specific element
    private static void checkElementExistence(Set<String> set, String element) {
        if (set.contains(element)) {
            System.out.println(element + " exists in the set.");
        } else {
            System.out.println(element + " does not exist in the set.");
        }
    }


}
