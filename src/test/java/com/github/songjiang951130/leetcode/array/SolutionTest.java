package com.github.songjiang951130.leetcode.array;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class SolutionTest {
    Solution solution = new Solution();

    @Test
    public void testArray(){
        Assert.assertEquals(4,solution.removeDuplicates(new int[]{1,2,3,4}));
        Assert.assertEquals(2,solution.removeDuplicates(new int[]{1,2,2}));

        Assert.assertEquals(2,solution.removeDuplicates(new int[]{1,1,2}));
//        System.out.println();
    }
}
