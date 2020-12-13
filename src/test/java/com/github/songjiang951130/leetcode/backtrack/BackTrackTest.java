package com.github.songjiang951130.leetcode.backtrack;

import org.junit.Assert;
import org.junit.Test;

public class BackTrackTest {
    BackTrack backTrack = new BackTrack();

    @Test
    public void getPermutation() {
        String case1 = backTrack.getPermutation(3, 3);
        Assert.assertEquals("213", case1);

        String case2 = backTrack.getPermutation(4, 9);
        Assert.assertEquals("213", case1);

        String case3 = backTrack.getPermutation(3, 1);
        Assert.assertEquals("123", case3);
    }
}