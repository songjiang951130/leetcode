package com.github.songjiang951130.leetcode.string;

import com.github.songjiang951130.leetcode.string.Prefix;

import org.junit.Assert;
import org.junit.Test;

public class PrefixTest {
    @Test
    public void longestCommonPrefix() {
        Prefix prefix = new Prefix();
        String[] case1 = { "abv", "abd", "abv", };
        Assert.assertEquals("ab", prefix.longestCommonPrefix(case1));
        String[] case2 = { "abv", "bbd", "cbv", };
        Assert.assertEquals("", prefix.longestCommonPrefix(case2));
        String[] case3 = { "a", };
        Assert.assertEquals("a", prefix.longestCommonPrefix(case3));
        Assert.assertEquals("", prefix.longestCommonPrefix(null));
    }
}
