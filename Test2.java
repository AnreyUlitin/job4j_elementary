package ru.job4j.Calculator;

import org.junit.Assert;

public @interface Test2 {

    @Test2
    public void whenA0B1C1X1Then2() {
        /* Входные параметры. Их будет 4 штуки */
        int a = 0;
        int b = 1;
        int c = 1;
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
