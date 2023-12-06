package com.github.songjiang951130.leetcode.array;

import com.google.common.collect.Lists;
import org.junit.Assert;
import org.junit.Test;

import java.util.Collections;
import java.util.List;

public class SolutionTest {
    Solution solution = new Solution();

    @Test
    public void testArray() {
        Assert.assertEquals(4, solution.removeDuplicates(new int[]{1, 2, 3, 4}));
        Assert.assertEquals(2, solution.removeDuplicates(new int[]{1, 2, 2}));
        Assert.assertEquals(2, solution.removeDuplicates(new int[]{1, 1, 2}));
    }

    @Test
    public void testThreeSum() {
        List<List<Integer>> res1 = Lists.newArrayList(
                Lists.newArrayList(-1, -1, 2),
                Lists.newArrayList(-1, 0, 1)
        );
        Assert.assertEquals(res1,
                solution.threeSum(new int[]{0, 1, -1, -1, 2, -1, -4}));

        List<List<Integer>> res2 = Lists.newArrayList(
                Lists.newArrayList(-2, 0, 2),
                Lists.newArrayList(-2, 1, 1)
        );
        Assert.assertEquals(res2,
                solution.threeSum(new int[]{-2, 0, 1, 1, 2}));

        List<List<Integer>> res3 = Lists.newArrayList();
        res3.add(Lists.newArrayList(-2, 0, 2));
        Assert.assertEquals(res3,
                solution.threeSum(new int[]{-2, 0, 0, 2, 2}));


    }
}
