package generics.genericmethod;

public class Main {

    public static void main(String[] args) {

        Integer a = 4;
        Integer b = 9;
        Integer c = 20;
        System.out.println(GenericMethod.findMax(a, b, c));

        Double x = 6.9;
        Double y = 15.5;
        Double z = 2.0;
        System.out.println(GenericMethod.findMax(x, y, z));

        String str1 = "javascript";
        String str2 = "angular";
        String str3 = "react";
        System.out.println(GenericMethod.findMax(str1, str2, str3));

    }
}
