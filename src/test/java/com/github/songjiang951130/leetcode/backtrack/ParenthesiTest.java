package com.github.songjiang951130.leetcode.backtrack;

import org.junit.Test;

import static org.junit.Assert.*;

public class ParenthesiTest {
    Parenthesi parenthesi = new Parenthesi();

    @Test
    public void generateParenthesis() {
        parenthesi.generateParenthesis(2);
    }
}