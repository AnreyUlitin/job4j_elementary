package ru.job4j.Condition;

import org.junit.Assert;
import org.junit.Test;

import java.awt.*;

    public class PointTest {
        @Test
        public void when11to22then(int) {
            int expected = (int) 1.41;
            int x1 = 1;
            int y1 = 1;
            int x2 = 2;
            int y2 = 2;
            double out = Point.distance(x1, y1, x2, y2);
            Assert.assertEquals(expected, out, 0.01);
        }

    }