package com.github.songjiang951130.leetcode.thread;

import org.junit.Test;

import static org.junit.Assert.*;

public class MyPrinterTest {

    @Test
    public void print() {
        new Thread(new MyPrinter.PrintRunnable()).start();
        new Thread(new MyPrinter.PrintRunnable()).start();
        try {
            Thread.sleep(20000);
            assertEquals(100, MyPrinter.val);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}