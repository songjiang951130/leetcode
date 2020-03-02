package com.github.songjiang951130.leetcode.string;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestTest {
    com.github.songjiang951130.leetcode.string.Test test = new com.github.songjiang951130.leetcode.string.Test();

    @Test
    public void deleteStr() {
        Assert.assertEquals("abcdea", test.deleteStr("aaabbcdeaa"));
        Assert.assertEquals("a", test.deleteStr("a"));
        Assert.assertEquals("abc", test.deleteStr("abc"));
    }
}