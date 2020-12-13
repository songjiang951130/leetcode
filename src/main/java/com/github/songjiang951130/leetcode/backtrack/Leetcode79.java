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

    public static void main(String[] args) {
        Leetcode79 leetcode79 = new Leetcode79();
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
        System.out.println(res);
    }

}
