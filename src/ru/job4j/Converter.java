package ru.job4j.covert;

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

            double in = 140;
            double expected = 2;
            double out = Converter.rubleToEuro(in);
            boolean passed = expected == out;
            System.out.println("140 rubles are 2 euro. Test result : " + passed);

            double dollar = Converter.rubleToDollar(140);
            System.out.println("140 rubles are " + dollar + " dollar.");

            double in1 = 140;
            double expected1 = 2.3333333333333335;
            double out1 = Converter.rubleToDollar(in1);
            boolean passed1 = expected1 == out1;
            System.out.println("140 rubles are 2.3333333333333335 dollar. Test result: " + passed1);
        }
    }
