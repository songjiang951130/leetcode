package com.github.songjiang951130.leetcode.concurrent;

public class IntSynRunnable implements Runnable {
    private Count count;
    private long start;

    public IntSynRunnable(Count c, long start) {
        this.count = c;
        this.start = start;
    }

    @Override
    public void run() {
        synchronized (count) {
            count.add();
        }
        if (count.getVal() == 200) {
            System.out.println("synchronized:" + (System.currentTimeMillis() - start) + " " + count.getVal());
        }
    }
}
