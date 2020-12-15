package com.github.songjiang951130.leetcode.thread;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

public class IntegerTest {
    public static void main(String[] args) {
        AtomicInteger atomicInteger = new AtomicInteger();
        atomicInteger.incrementAndGet();
        BlockingQueue<Integer> integerBlockingDeque = new ArrayBlockingQueue<>(10);
        integerBlockingDeque.add(10);
        integerBlockingDeque.poll();
    }
}
