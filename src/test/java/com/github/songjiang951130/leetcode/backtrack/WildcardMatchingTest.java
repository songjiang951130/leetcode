package com.github.songjiang951130.leetcode.backtrack;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class WildcardMatchingTest {

    @Test
    public void isMatch() {
        WildcardMatching wildcardMatching = new WildcardMatching();

        Assert.assertFalse(wildcardMatching.isMatch("aa", "a"));
        Assert.assertTrue(wildcardMatching.isMatch("aa", "aa"));
        Assert.assertTrue(wildcardMatching.isMatch("aa", "*"));
        Assert.assertFalse(wildcardMatching.isMatch("cb", "?a"));
        Assert.assertFalse(wildcardMatching.isMatch("cb", "*a"));

        Assert.assertTrue(wildcardMatching.isMatch("adceb", "*a*b"));
        Assert.assertFalse(wildcardMatching.isMatch("acdcb", "a*c?b"));
//        Assert.assertTrue(wildcardMatching.isMatch("abefcdgiescdfimde", "ab*cd?i*de"));
    }
}