package ru.job4j.Calculator;

import org.junit.Assert;

public @interface Test3 {

    @Test3
    public void whenA1B1C0X1Then2() {
        /* Входные параметры. Их будет 4 штуки */
        int a = 1;
        int b = 1;
        int c = 0;
        int x = 1;
        /* ожидаемое значение. Это всегда одна переменная. */
        int expected = 2;
        /* вызов метода, который хотим проверить. */
        /* Результат вычисления. Это всегда одна переменная. */

        int rsl = X2.calc(a, b, c, x);
        /* сравнение полученного значения с ожидаемым */
        Assert.assertEquals(expected, rsl);
    }
}

