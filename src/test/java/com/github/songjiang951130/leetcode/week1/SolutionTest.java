package com.github.songjiang951130.leetcode.week1;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    Solution solution = new Solution();

    @Test
    public void testCase1() {
        System.out.println(solution.reformat("a0b1c2"));
        System.out.println(solution.reformat("leetcode"));
        System.out.println(solution.reformat("1229857369"));
        Assert.assertEquals("c2o0v1i9d", solution.reformat("covid2019"));
        Assert.assertEquals("1a2b3", solution.reformat("ab123"));
    }
}
