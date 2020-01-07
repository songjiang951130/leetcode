package com.github.songjiang951130.leetcode.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 *
 */
public class ThreadSerivice {
    //    ExecutorService
    public void test() {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        for (int i = 0; i < 100; i++) {
            executorService.execute(() -> {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("hello");
            });
        }

        executorService.shutdown();
    }

    public static void main(String[] args) {
        
    }


}
