package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableTest implements Comparable<ComparableTest>{
        private int id;
        private String name;
        private int age;
        private String address;

    public int getAge() {
        return age;
    }

    public ComparableTest() {
        }

        public ComparableTest(int id, String name, int age, String address) {
            super();
            this.id = id;
            this.name = name;
            this.age = age;
            this.address = address;
        }

        public String getName() {
        return name;
         }

         @Override
            public String toString() {
             return "ComparableTest@id=" + id + ",name=" + name
                    + ",age=" + age + ",address=" + address;
        }

        @Override
        public int compareTo(ComparableTest student) {
            // sort student's name by ASC
            return this.getName().compareTo(student.getName());
        }

         // Sorting by age in descending order
        public int compareByAgeDescending(ComparableTest student) {
            return Integer.compare(student.getAge(), this.getAge());
        }



public static void main(String[] args) {
    // create list students
    List<ComparableTest> listStudents = new ArrayList<ComparableTest>();
    // add students to list
    listStudents.add(new ComparableTest(1, "Vinh", 19, "Hanoi"));
    listStudents.add(new ComparableTest(2, "Hoa", 19, "Hanoi"));
    listStudents.add(new ComparableTest(3, "Phu", 20, "Hanoi"));
    listStudents.add(new ComparableTest(4, "Quy", 22, "Hanoi"));
    // sort list student
    Collections.sort(listStudents);
    // show list students
    for (ComparableTest student : listStudents) {
        System.out.println(student.toString());
    }
    listStudents.sort((s1, s2) -> s2.getAge() - s1.getAge());
    System.out.println(listStudents);
    }
}