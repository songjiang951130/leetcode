package com.github.songjiang951130.leetcode.thread;

import org.junit.Test;

import static org.junit.Assert.*;

public class MyPrinterTest {

    @Test
    public void print() {
        Thread thread1 = new Thread(new MyPrinter.PrintRunnable());
        thread1.start();
        Thread thread2 = new Thread(new MyPrinter.PrintRunnable());
        thread2.start();
        try {
            while (!Thread.State.TERMINATED.equals(thread1.getState()) && !Thread.State.TERMINATED.equals(thread2.getState())) {
                Thread.sleep(200);
            }
            assertEquals(100, MyPrinter.val);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}