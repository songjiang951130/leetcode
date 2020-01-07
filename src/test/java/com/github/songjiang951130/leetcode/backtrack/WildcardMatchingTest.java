package com.github.songjiang951130.leetcode.backtrack;

import static org.junit.Assert.*;

import org.junit.Test;

public class WildcardMatchingTest {

    @Test
    public void isMatch() {
        WildcardMatching wildcardMatching = new WildcardMatching();

        assertFalse(wildcardMatching.isMatch("aa", "a"));
        assertTrue(wildcardMatching.isMatch("aa", "aa"));
        assertTrue(wildcardMatching.isMatch("aa", "*"));
        assertFalse(wildcardMatching.isMatch("cb", "?a"));
        assertFalse(wildcardMatching.isMatch("cb", "*a"));

        assertTrue(wildcardMatching.isMatch("adceb", "*a*b"));
        assertFalse(wildcardMatching.isMatch("acdcb", "a*c?b"));
    }
}