package com.github.songjiang951130.leetcode.stack;

import junit.framework.TestCase;

import java.util.Arrays;

public class TemperatureTest extends TestCase {
    Temperature t = new Temperature();

    /**
     * 给定⼀个列表 temperatures = [73, 74, 75, 71, 69, 72, 76, 73]，你的输出应该是 [1, 1, 4, 2, 1, 1, 0, 0]
     */
    public void testWaiterTemperature() {
        int[] res1 = t.waiterTemperature(new int[]{73, 74, 75, 71, 69, 72, 76, 73});
        System.out.println(Arrays.toString(res1));
        assertTrue(Arrays.equals(res1, new int[]{1, 1, 4, 2, 1, 1, 0, 0}));
    }
}