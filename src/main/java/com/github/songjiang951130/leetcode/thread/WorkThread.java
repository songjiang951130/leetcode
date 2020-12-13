package com.github.songjiang951130.leetcode.thread;

public class WorkThread implements Runnable {
    @Override
    public void run() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException interruptedException) {
            interruptedException.printStackTrace();
        }
        Thread current = Thread.currentThread();
        System.out.println(Thread.currentThread() + " end");
        if (current.getName().endsWith("son")) {
            return;
        }
        Thread threadChild = new Thread(new WorkThread(), Thread.currentThread().getName() + "-son");
        threadChild.start();
    }
}
