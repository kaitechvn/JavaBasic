package collections.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListTest {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        // insert
        list.add("khai");
        list.add("chien");
        list.add("duong1");
        list.add("duong2");
        System.out.println(list);

        // insert at index
        list.add(2, "Mr.Minh");
        System.out.println(list);

        // remove by value
        list.remove("khai");
        System.out.println(list);

        // remove by index
        list.remove(2);
        System.out.println(list);

        //TRAVERSE
        //for
        System.out.println("Traverse array list using FOR loop");
        for(int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        // short for
        System.out.println("Traverse array list using Short FOR loop");
        for (String elements : list) {
            System.out.println(elements);
        }

        // Convert ArrayList <-> Array
        // Array -> ArrayList
        System.out.println("Convert Array to ArrayList");
        String[] strings = new String[] {"Mr. Giang", "Ms Thao"};
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(strings));
        System.out.println(arrayList);

        // ArrayList -> Array (StreamAPI)
        System.out.println("Convert ArrayList to Array");
        System.out.println(Arrays.toString(list.stream().toArray(String[]::new)));
    }


}
