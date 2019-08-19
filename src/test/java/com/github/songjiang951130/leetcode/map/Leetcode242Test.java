package com.github.songjiang951130.leetcode.map;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Leetcode242Test {
    private  Leetcode242 leetcode;

    @Before
    public void setUp(){
        leetcode = new Leetcode242();
    }

    @Test
    public void isAnagram() {
        String s = "anagram";
        String t = "nagaram";
        Assert.assertTrue(leetcode.isAnagram(s,t));
    }


    @Test
    public void isAnagramCase2() {
        String s = "car";
        String t = "rat";
        Assert.assertFalse(leetcode.isAnagram(s,t));
    }
}