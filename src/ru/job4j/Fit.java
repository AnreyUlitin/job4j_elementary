package ru.job4j.Calculator;
public class Fit {
    public static double manWeight(short height) {
        double rslM = (height - 100) * 1.15;
        return rslM;
    }

    public static double womanWeight(short height) {
        double rslW = (height - 110) * 1.15;
        return rslW;
    }

    public static void main(String[] args) {
        short height = 187;
        double man = Fit.manWeight(height);
        System.out.println("Man 187 is " + man);
        double woman = Fit.womanWeight(height);
        System.out.println("Woman 187 is " + woman);
    }
}
