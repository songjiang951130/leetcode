package com.github.songjiang951130.leetcode.water;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void numEquivDominoPairs() {
        Solution solution = new Solution();
        int[][] test = {{1, 2}, {2, 1}, {3, 4}, {5, 6}};
        Assert.assertEquals(1, solution.numEquivDominoPairs(test));
        int[][] case2 = {{1, 1}, {2, 2}, {1, 1}, {1, 2}, {1, 2}, {1, 1}};
        Assert.assertEquals(4, solution.numEquivDominoPairs(case2));

    }
}