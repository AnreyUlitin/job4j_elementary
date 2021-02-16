package ru.job4j.Condition;
public class Triangle {

    public static boolean exist(double ab, double ac, double bc) {

        return ab + ac > bc && ac + bc > ab && ab + bc > ac;
    }
    public static void main(String[] args) {
        System.out.println(exist(2.0, 2.0, 4.5));
        System.out.println(exist(3.0, 3.0, 4.3));
        System.out.println(exist(15.0, 15.0, 21.2));

    }
}
