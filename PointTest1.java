package ru.job4j.Condition;

import org.junit.Assert;
import org.junit.Test;

import java.awt.*;

public class PointTest {
    @Test
    public void when23to45then(int) {
        int expected = (int) 2.82;
        int x1 = 2;
        int y1 = 3;
        int x2 = 4;
        int y2 = 5;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

}
