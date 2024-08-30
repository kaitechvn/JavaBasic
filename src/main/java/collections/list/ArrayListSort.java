package collections.list;

import java.util.*;

public class ArrayListSort {

    public static void main(String[] args) {

        List<Integer> arrays = new ArrayList<>(Arrays.asList(7, 9, 5, -1, 4, 4));
        arrays.sort((o1, o2) -> o1 - o2);
        System.out.println(arrays);

        arrays.sort(((o1, o2) -> o2 - o1));
        System.out.println("DESC SORT ORDER");
        System.out.println(arrays);

        System.out.println("ASC SORT USING COMPARATOR");
        arrays.sort(Comparator.comparingInt(o -> o));
        System.out.println(arrays);

        System.out.println("REVERSED");
        arrays.sort(Comparator.comparingInt(o -> (int) o).reversed());
        System.out.println(arrays);

        arrays.add(null);
        // Sort having null
        arrays.sort(Comparator.nullsFirst(Comparator.comparingInt(o -> o)));
        System.out.println(arrays);
    }


}