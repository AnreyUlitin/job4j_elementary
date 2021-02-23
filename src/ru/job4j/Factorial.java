package ru.job4j.ru.job4j.loop;


public class Factorial {
    @SuppressWarnings("checkstyle:LeftCurly")
    public static int calc(int n)
    {
        int result = 1;
        for (int i = 1; i <= n; i++)
        {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(calc(5));
        System.out.println(calc(8));
        System.out.println(calc(10));
    }
    }
