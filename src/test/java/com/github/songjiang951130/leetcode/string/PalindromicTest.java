package com.github.songjiang951130.leetcode.string;

import org.junit.Assert;
import org.junit.Test;


public class PalindromicTest {
    Palindromic palindromic = new Palindromic();

    @Test
    public void isPalindrome() {
        Assert.assertTrue(palindromic.isPalindrome(191));
        Assert.assertTrue(palindromic.isPalindrome(1221));
        Assert.assertFalse(palindromic.isPalindrome(1234));
        Assert.assertFalse(palindromic.isPalindrome(-123));
    }
}