package com.github.songjiang951130.leetcode.concurrent;

public class Count {


    private int val;

    public Count(int val) {
        this.val = val;
    }

    public void add() {
        val++;
    }
    public int getVal() {
        return val;
    }

}
