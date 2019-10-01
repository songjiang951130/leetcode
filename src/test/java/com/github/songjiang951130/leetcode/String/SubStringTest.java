package com.github.songjiang951130.leetcode.String;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SubStringTest {

    @Test
    public void lengthOfLongestSubstring() {
        SubString subString = new SubString();
        String case1 = "";
        Assert.assertEquals(0, subString.lengthOfLongestSubstring(case1));
        String caseBlank = " ";
        Assert.assertEquals(1, subString.lengthOfLongestSubstring(caseBlank));


        String case2 = "bbbbb";
        Assert.assertEquals(1, subString.lengthOfLongestSubstring(case2));

        Assert.assertEquals(2, subString.lengthOfLongestSubstring("au"));
        Assert.assertEquals(2, subString.lengthOfLongestSubstring("abba"));

        String case3 = "pwwkew";
        Assert.assertEquals(3, subString.lengthOfLongestSubstring(case3));

        String case4 = "abcabcbb";
        Assert.assertEquals(3, subString.lengthOfLongestSubstring(case4));

    }
}