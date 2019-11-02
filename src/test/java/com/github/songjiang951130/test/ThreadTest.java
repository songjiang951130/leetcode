package com.github.songjiang951130.test;

import org.junit.Test;

public class ThreadTest implements Runnable {
    public static int i = 0;

    @Override
    public void run() {

        try {
            Thread.sleep(20);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
//        synchronized (Count1000.class) {
            i++;
            System.out.println(Thread.currentThread().getName() + " " + i);
//        }
    }

    @Test
    public void test() {
        for (int j = 0; j < 200; j++) {
            new Thread(new ThreadTest()).start();
        }

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}