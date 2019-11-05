package com.github.songjiang951130.leetcode.dp;

import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class ContainerTest {
    Container container = new Container();

    @Test
    public void maxArea() {
        int[] case1 = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        assertEquals(49, container.maxArea(case1));
    }

}