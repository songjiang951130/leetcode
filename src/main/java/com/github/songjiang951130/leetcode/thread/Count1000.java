package com.github.songjiang951130.leetcode.thread;

public class Count1000 implements Runnable {
    private IntTest test;

    public Count1000(IntTest test) {
        this.test = test;
    }

    @Override
    public void run() {
        synchronized (test) {
            int val = test.getVal();
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            test.setVal(val + 1);
            System.out.println(test.getVal());
        }
    }

    public static void main(String[] args) {
        IntTest test = new IntTest();
        for (int j = 0; j < 1000; j++) {
            new Thread(new Count1000(test)).start();
        }
    }
}
