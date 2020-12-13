package com.github.songjiang951130.leetcode.backtrack;

public class Leetcode79 {
    public boolean exist(char[][] board, String word) {
        boolean[][] visited = new boolean[board.length][board[0].length];
        boolean res = false;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                res = backtrack(board, visited, word.toCharArray(), 0, 0, 0);
                if (res) {
                    break;
                }
            }
        }
        return res;
    }

    private boolean backtrack(char[][] board, boolean[][] visited, char[] w, int index, int r, int c) {
        if (board[r][c] != w[index]) {
            return false;
        } else if (index == w.length - 1) {
            return true;
        }
        boolean result = false;
        visited[r][c] = true;
        int[][] round = new int[][] { { 1, 0 }, { -1, 0 }, { 0, 1 }, { 0, -1 } };
        for (int[] v : round) {
            int newR = v[0] + r;
            int newC = v[1] + c;
            System.out.println("newR:" + newR + " ne w C:" + newC);
            if (newR >= 0 && newR < board.length && newC >= 0 && newC < board[newR].length && !visited[newR][newC]) {
                index++;
                boolean temp = backtrack(board, visited, w, index, newR, newC);
                if (temp) {
                    result = true;
                    break;
                }
            }
        }
        visited[r][c] = false;
        return result;
    }
}
