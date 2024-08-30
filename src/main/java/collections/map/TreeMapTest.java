package collections.map;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapTest {

    public static void main(String[] args) {
        // Create a TreeMap, O(logn) for operations
        TreeMap<String, Integer> treeMap = new TreeMap<>();

        // Add some key-value pairs to the TreeMap
        treeMap.put("banana", 2);
        treeMap.put("apple", 5);
        treeMap.put("orange", 3);
        treeMap.put("mango", 1);
        treeMap.put("grape", 4);

        // Print the TreeMap
        System.out.println("TreeMap entries (sorted by key):");
        for (Map.Entry<String, Integer> entry : treeMap.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }

        // Testing custom sorting with a TreeMap
        TreeMap<String, Integer> reverseTreeMap = new TreeMap<>(Comparator.reverseOrder());

        // Add the same key-value pairs to the reverse order TreeMap
        reverseTreeMap.putAll(treeMap);

        // Print the reverse order TreeMap
        System.out.println("\nTreeMap entries (sorted by key in reverse order):");
        for (Map.Entry<String, Integer> entry : reverseTreeMap.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
    }
}
