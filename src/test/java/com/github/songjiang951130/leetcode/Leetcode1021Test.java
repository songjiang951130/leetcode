package com.github.songjiang951130.leetcode;

import org.junit.Test;
import com.github.songjiang951130.leetcode.stack.Leetcode1021;

import static org.junit.Assert.assertEquals;

public class Leetcode1021Test {
    @Test
    public void testCase1() {
        Leetcode1021 code = new Leetcode1021();
        String s = "()()";
        assertEquals("", code.removeOuterParentheses(s));
    }

    @Test
    public void testCase2() {
        Leetcode1021 code = new Leetcode1021();
        String s = "(()())(())";
        assertEquals("()()()", code.removeOuterParentheses(s));
    }

    @Test
    public void testCase3() {
        Leetcode1021 code = new Leetcode1021();
        String  s = "(()())(())(()(()))";
        assertEquals("()()()()(())", code.removeOuterParentheses(s));
    }
}
