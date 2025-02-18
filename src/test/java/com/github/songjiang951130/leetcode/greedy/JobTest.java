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

    @Test
    public void testCanCompleteCircuit() {
        int i = job.canCompleteCircuit(new int[]{1, 2, 3, 4, 5}, new int[]{3, 4, 5, 1, 2});
        assertEquals(3, i);

        i = job.canCompleteCircuit(new int[]{2, 3, 4}, new int[]{3, 4, 3});
        assertEquals(-1, i);
        //5,1,2,3,4


        i = job.canCompleteCircuit(new int[]{5,1,2,3,4}, new int[]{4,4,1,5,1});
        assertEquals(4, i);


        i = job.canCompleteCircuit(new int[]{4,5,2,6,5,3}, new int[]{3,2,7,3,2,9});
        assertEquals(-1, i);
    }
}