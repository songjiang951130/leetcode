package com.github.songjiang951130.leetcode.math;

class Divide {
    public int mySqrt(int x) {
        if (x == 1) {
            return x;
        }
        return (int) mySqrt(0, x, x);
    }

    private double mySqrt(double start, double end, double val) {
        double mid = (end + start) / 2.0;
        if (Math.abs(val - mid * mid) < 0.01) {
            return mid;
        }
        if (mid * mid > val) {
            return mySqrt(start, mid, val);
        } else {
            return mySqrt(mid, end, val);
        }
    }
}