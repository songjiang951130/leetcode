package com.github.songjiang951130.leetcode.offer;

import com.github.songjiang951130.leetcode.dp.Offer48;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Offer48Test {

    @Test
    public void lengthOfLongestSubstring() {
        Offer48 offer48 = new Offer48();
        int res = offer48.lengthOfLongestSubstring("pwwkew");
        assertEquals(3, res);

        int case2 = offer48.lengthOfLongestSubstring("abcabcbb");
        assertEquals(3, case2);
    }

    @Test
    public void lengthOfLongestSubstringV2() {
        Offer48 offer48 = new Offer48();
        int res = offer48.lengthOfLongestSubstringV2("pwwkew");
        assertEquals(3, res);

        int case2 = offer48.lengthOfLongestSubstringV2("abcabcbb");
        assertEquals(3, case2);
    }
}