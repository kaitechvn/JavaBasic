package collections.list;

import java.util.LinkedList;

public class LinkedListTest {

    public static void main(String[] args) {

        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("java");
        linkedList.add("spring");
        linkedList.add("mysql");

        for (String elements : linkedList) {
            System.out.println(elements);
        }

        linkedList.addFirst("vuejs");
        System.out.println(linkedList.getFirst());

        // Print the
        System.out.println();
        linkedList.add("html");
        System.out.println(linkedList);

        System.out.println();
        linkedList.removeLast(); // Delete first element
        linkedList.removeFirst(); // Delete last element
        System.out.println(linkedList);
    }
}
