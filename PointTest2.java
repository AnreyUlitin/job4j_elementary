package ru.job4j.Condition;

import org.junit.Assert;
import org.junit.Test;

import java.awt.*;

public class PointTest {
    @Test
    public void when510to67then(int) {
        int expected = (int) 3.16;
        int x1 = 5;
        int y1 = 10;
        int x2 = 6;
        int y2 = 7;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }
}
