package com.github.songjiang951130.leetcode.math;

public class Bit {
    public int rangeBitwiseAnd(int m, int n) {
        /**
         * 5 0101
         * 6 0110
         * 7 0111
         * 公共前缀：4
         */
        int count = 0;
        while (m != n) {
            m = m >> 1;
            n = n >> 1;
            count++;
        }
        //m == n
        return m<<count;
    }
}
