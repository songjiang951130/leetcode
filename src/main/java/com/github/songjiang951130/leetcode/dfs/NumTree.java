package com.github.songjiang951130.leetcode.dfs;

public class NumTree {

    //1 2 5 14
    public int numTrees(int n) {
        int[] array = new int[n + 1];
        array[0] = 1;
        array[1] = 1;

        for (int i = 2; i < array.length; i++) {
            array[i] = array[i - 1] + array[i - 2];
        }
        return array[array.length - 1];
    }
}
