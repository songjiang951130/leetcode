package com.github.songjiang951130.leetcode.offer;

import com.github.songjiang951130.leetcode.dp.Offer48;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Offer48Test {
    public static final String CASE1 = "pwwkew";
    public static final String CASE2 = "abcabcbb";
    Offer48 offer48 = new Offer48();


    @Test
    public void lengthOfLongestSubstring() {
        int res = offer48.lengthOfLongestSubstring(CASE1);
        assertEquals(3, res);
        int case2 = offer48.lengthOfLongestSubstring(CASE2);
        assertEquals(3, case2);
    }

    @Test
    public void lengthOfLongestSubstringV2() {
        Offer48 offer48 = new Offer48();
        int res = offer48.lengthOfLongestSubstringV2(CASE1);
        assertEquals(3, res);

        int case2 = offer48.lengthOfLongestSubstringV2(CASE2);
        assertEquals(3, case2);
    }

    @Test
    public void lengthOfLongestSubstringV3() {
        int res = offer48.lengthOfLongestSubstringV3(CASE1);
        assertEquals(3, res);

        int case2 = offer48.lengthOfLongestSubstringV3(CASE2);
        assertEquals(3, case2);
    }
}