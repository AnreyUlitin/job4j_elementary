package ru.job4j.convert;

import org.junit.jupiter.api.Test;
import ru.job4j.ru.job4j.loop.PrimeNumber;

import static org.junit.Assert.assertThat;

public class PrimeNumberTest {
}
package ru.job4j.loop;

        import org.junit.Test;

        import static org.hamcrest.Matchers.is;
        import static org.junit.Assert.*;

public class PrimeNumberTest {
    @Test
    public void when5() {
        int count = PrimeNumber.calc(5);
        assertThat(count, is(3));
    }

    private Object is(int i) {
    }

    @Test
    public void when11() {
        int count = PrimeNumber.calc(11);
        assertThat(count, is(5));
    }

    @Test
    public void when2() {
        int count = PrimeNumber.calc(2);
        assertThat(count, is(1));
    }
}
