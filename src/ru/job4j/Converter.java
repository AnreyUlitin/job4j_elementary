package ru.job4j;
public class Converter {
    public static double rubleToEuro(double value) {
        double rsl = value / 70; /* формула перевода рублей в евро. */
        return rsl;
    }
    public static double rubleToDollar(double value) {
        double rsl1 = value / 60; /* формула перевода рублей в доллары. */
        return rsl1;
    }
    public static void main(String[] args) {
        double euro = Converter.rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");
        double dollar = Converter.rubleToDollar(140);
        System.out.println("140 rubles are " + dollar + " dollar.");
    }
}