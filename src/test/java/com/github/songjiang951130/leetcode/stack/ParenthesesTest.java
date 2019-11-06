package com.github.songjiang951130.leetcode.stack;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class ParenthesesTest {
    Parentheses parentheses = new Parentheses();

    @Test
    public void generateParenthesis() {
        int case1 = 3;
        List<String> list1 = new ArrayList<String>();
        list1.add("((()))");
        list1.add("(()())");
        list1.add("(())()");
        list1.add("()(())");
        list1.add("()()()");
        assertEquals(list1, parentheses.generateParenthesis(case1));
    }

    @Test
    public void isValid() {
        assertTrue(parentheses.isValid("((()))"));
        assertTrue(parentheses.isValid("({}()[])"));
        assertFalse(parentheses.isValid("({})]"));
        assertFalse(parentheses.isValid("({})["));
        assertFalse(parentheses.isValid("["));

    }
}