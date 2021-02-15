package ru.job4j.Condition;

public class Triangle {

    public static boolean exist(double ab, double ac, double bc) {
        boolean result = ab + ac > bc;
        boolean result1 = ac + bc > ab;
        boolean result2 = ab + bc > ac;

        return result && result2 && result2;
    }
    public static void main(String[] args) {
        System.out.println(exist(2.0, 2.0, 4.5));
        System.out.println(exist(3.0, 3.0, 4.3));
        System.out.println(exist(15.0, 15.0, 21.2));

    }
}
