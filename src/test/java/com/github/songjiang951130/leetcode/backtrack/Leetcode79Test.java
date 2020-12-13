package com.github.songjiang951130.leetcode.backtrack;

import org.junit.Test;

import static org.junit.Assert.*;

public class Leetcode79Test {
    Leetcode79 leetcode79 = new Leetcode79();

    @Test
    public void exist() {
        /**
         * 给定 word = "ABCCED", 返回 true 给定 word = "SEE", 返回 true 给定 word = "ABCB", 返回
         * false
         */
        char[][] board = new char[3][4];
        board[0] = new char[] { 'A', 'B', 'C', 'E' };
        board[1] = new char[] { 'S', 'F', 'C', 'S' };
        board[2] = new char[] { 'A', 'D', 'E', 'E' };
        String word = "ABCCED";
        boolean res = leetcode79.exist(board, word);
        assertFalse(res);
    }
}