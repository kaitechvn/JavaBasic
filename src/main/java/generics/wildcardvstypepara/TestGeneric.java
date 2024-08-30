package generics.wildcardvstypepara;

import java.util.ArrayList;
import java.util.List;

public class TestGeneric {

        public static <E> void printArray(E[] elements) {
            for (E element : elements) {
                System.out.print(element + " ");
            }
            System.out.println();
        }

        public static void  printArr(List<?> list) {
            for (int i = 0; i < list.size(); i++) {
                System.out.print(list.get(i) + " ");
            }
        }


        public static void main(String args[]) {
            Integer[] intArray = { 10, 20, 30, 40, 50 };
            Character[] charArray = { 'J', 'A', 'V', 'A' };
            List<Integer> intList = new ArrayList<>();
            intList.add(1);
            intList.add(2);

            List<String> stringList = new ArrayList<>();
            stringList.add("kHai");
            stringList.add("dzaii");

            System.out.print("In mảng số nguyên: ");
            printArray(intArray);

            System.out.print("In mảng ký tự: ");
            printArray(charArray);

            printArr(intList);
            System.out.println();
            printArr(stringList);
        }
    }

