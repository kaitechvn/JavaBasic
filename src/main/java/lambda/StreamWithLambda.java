package lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamWithLambda {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Khai", "Chien", "Duong", "Hoa");

        // Use stream with lambda expressions to filter and transform the list
        List<String> filteredNames = names.stream()
                .filter(name -> name.length() > 3)   // Filter names longer than 3 characters
                .map(name -> name.toUpperCase())     // Convert names to uppercase
                .collect(Collectors.toList());       // Collect the result into a new list

        filteredNames.forEach(System.out::println);
    }
}
