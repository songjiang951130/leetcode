package com.github.songjiang951130.leetcode.string;

import org.junit.Assert;
import org.junit.Test;

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

    @Test
    public void lengthOfLongestSubstringWithSlideWindow() {
        SubString subString = new SubString();
        String case1 = "";
        Assert.assertEquals(0, subString.lengthOfLongestSubstringWithSlideWindow(case1));
        String caseBlank = " ";
        Assert.assertEquals(1, subString.lengthOfLongestSubstringWithSlideWindow(caseBlank));

        String case2 = "bbbbb";
        Assert.assertEquals(1, subString.lengthOfLongestSubstringWithSlideWindow(case2));

        Assert.assertEquals(2, subString.lengthOfLongestSubstringWithSlideWindow("au"));
        Assert.assertEquals(2, subString.lengthOfLongestSubstringWithSlideWindow("abba"));

        String case3 = "pwwkew";
        Assert.assertEquals(3, subString.lengthOfLongestSubstringWithSlideWindow(case3));

        String case4 = "abcabcbb";
        Assert.assertEquals(3, subString.lengthOfLongestSubstringWithSlideWindow(case4));
    }
}