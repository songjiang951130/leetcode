package com.github.songjiang951130.leetcode.math;

class Solution {
    public int mySqrt(int x) {
        return (int) mySqrt(0, x, x);
    }

    private double mySqrt(double start, double end, double val) {
        double mid = end + start / 2.0;
        if (mid * mid - val < 0.0001) {
            return mid;
        }
        if (mid * mid > val) {
            return mySqrt(start, mid, val);
        } else {
            return mySqrt(end, start, val);
        }
    }

}