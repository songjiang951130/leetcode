package com.github.songjiang951130.leetcode.thread;

/**
 * 线程交替打印
 */
public class MyPrinter {
    private static final Object monitor = new Object();
    public static int val = 0;

    public static class PrintRunnable implements Runnable {
        @Override
        public void run() {
            while (val < 100) {
                synchronized (monitor) {
                    try {
                        val++;
                        Thread.sleep(100);
                        System.out.println(Thread.currentThread().getName() + " val:" + val);
                        monitor.notify();
                        monitor.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
