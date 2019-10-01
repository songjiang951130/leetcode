package com.github.songjiang951130.leetcode.concurrent;

import java.util.concurrent.atomic.AtomicInteger;

public class IntRunnable implements Runnable {
    private volatile AtomicInteger atomicInteger;
    private long start;

    public IntRunnable(AtomicInteger atomicInteger, long start) {
        this.atomicInteger = atomicInteger;
        this.start = start;
    }

    @Override
    public void run() {
        int result = atomicInteger.getAndIncrement();
        if (atomicInteger.get() == 200) {
            System.out.println("atomInteger:"+(System.currentTimeMillis() - start) + " " + atomicInteger);
        }
//        System.out.println(System.currentTimeMillis() - start + " " + atomicInteger + " " + result);
    }
}
