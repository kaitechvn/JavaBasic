package collections.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {

    public static void main(String[] args) {
        // Initialize HashMap
        HashMap<Integer, String> map = new HashMap<>();

        // Test put() - Inserting key-value pairs
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Cherry");
        map.put(4, "Date");
        map.put(5, "Elderberry");

        System.out.println("Initial HashMap: " + map);

        // Test get() - Retrieve value by key
        String fruit = map.get(3);
        System.out.println("Value for key 3: " + fruit);

        // Test containsKey() - Check if a key exists
        boolean containsKey = map.containsKey(6);
        System.out.println("HashMap contains key 6: " + containsKey);

        // Test containsValue() - Check if a value exists
        boolean containsValue = map.containsValue("Banana");
        System.out.println("HashMap contains value 'Banana': " + containsValue);

        // Test put() with existing key - Updating a value
        map.put(2, "Blueberry");
        System.out.println("HashMap after updating key 2: " + map);

        // Test remove() - Remove key-value pair by key
        map.remove(4);
        System.out.println("HashMap after removing key 4: " + map);

        // Test size() - Get the size of the HashMap
        int size = map.size();
        System.out.println("Size of HashMap: " + size);

        // Test isEmpty() - Check if the HashMap is empty
        boolean isEmpty = map.isEmpty();
        System.out.println("HashMap is empty: " + isEmpty);

        // Test keySet() - Get the set of keys
        System.out.println("Keys in HashMap: " + map.keySet());

        // Test values() - Get the collection of values
        System.out.println("Values in HashMap: " + map.values());

        // Test entrySet() - Get the set of key-value pairs (entries)
        System.out.println("Entries in HashMap: " + map.entrySet());

        // Test iteration over key-value pairs using entrySet()
        System.out.println("Iterating over HashMap entries:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Test putIfAbsent() - Add a key-value pair if key is not already present
        map.putIfAbsent(4, "Dragonfruit");
        System.out.println("HashMap after putIfAbsent(4, 'Dragonfruit'): " + map);

        // Test replace() - Replace the value of an existing key
        map.replace(3, "Cranberry");
        System.out.println("HashMap after replacing value of key 3: " + map);

        // Test replace() with old value - Replace only if the old value matches
        boolean isReplaced = map.replace(1, "Apple", "Apricot");
        System.out.println("Was value of key 1 replaced? " + isReplaced);
        System.out.println("HashMap after conditional replace: " + map);

        // Test clear() - Remove all key-value pairs
        map.clear();
        System.out.println("HashMap after clear(): " + map);

        // Test again isEmpty() after clear
        isEmpty = map.isEmpty();
        System.out.println("HashMap is empty after clear: " + isEmpty);
    }
}

