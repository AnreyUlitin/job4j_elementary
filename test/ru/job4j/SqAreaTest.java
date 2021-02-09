package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.Condition.SqArea;

public class SqAreaTest {

    @Test
    public void square() {
        int expected = 3;
        int p = 24;
        int k = 3;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }
