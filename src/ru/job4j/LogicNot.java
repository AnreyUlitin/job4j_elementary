package ru.job4j.condition;

public class LogicNot {

    public boolean isEven(int num) {
        return num % 2 == 0;
    }

    public boolean isPositive(int num) {
        return num > 0;
    }

    public boolean notEven(int num) {
        return !isEven(num);
    }

    public boolean notPositive(int num) {
        return !isPositive(num);
    }

    public boolean notEvenAndPositive(int num) {
        if (!(num % 2 == 0) && num > 0)
            return notEvenAndPositive(num);
    }

    public boolean evenOrNotPositive(int num) {
        if ((num % 2 == 0) && !(num > 0))
            return  evenOrNotPositive(num);
    }
}