package com.github.songjiang951130.leetcode.greedy;

import org.junit.Test;

import static org.junit.Assert.*;

public class JobTest {
    Job job = new Job();

    @Test
    public void handle() {
        int[][] case1 = {{2, 5}, {3, 2}, {2, 1}};
        assertEquals(8, job.handle(case1));
        int[][] case2 = {{3, 3}, {4, 4}, {5, 5}};
        assertEquals(15, job.handle(case2));
    }
}