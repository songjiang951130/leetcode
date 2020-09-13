package com.github.songjiang951130.leetcode.heap;

import org.junit.Assert;
import org.junit.Test;

public class KProblemTest {
    KProblem kProblem = new KProblem();

    @Test
    public void testK() {
        Assert.assertEquals(5, kProblem.findKthLargest(new int[]{3, 2, 1, 5, 6, 4}, 2));
        Assert.assertEquals(4, kProblem.findKthLargest(new int[]{3, 2, 3, 1, 2, 4, 5, 5, 6}, 4));
    }

    @Test
    public void topKFrequent() {
        Assert.assertArrayEquals(new int[]{1, 2}, kProblem.topKFrequent(new int[]{1, 1, 1, 2, 2, 3, 2}, 2));
    }
}
