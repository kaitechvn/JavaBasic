package generics.wildcard.unbounded;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class WildcardDemo {
    public static void main(String[] args)
    {

        // Integer List
        List<Integer> list1 = Arrays.asList(1, 2, 3);

        // Double list
        List<Double> list2 = Arrays.asList(1.1, 2.2, 3.3);

        // String list
        List<String> list3 = new ArrayList<>();
        list3.add("Khai");
        list3.add("dzai");

        printlist(list1);

        printlist(list2);

        printlist(list3);
    }

    private static void printlist(List<?> list)
    {

        System.out.println(list);
    }
}