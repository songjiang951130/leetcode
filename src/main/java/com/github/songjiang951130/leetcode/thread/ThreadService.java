package com.github.songjiang951130.leetcode.thread;

import java.util.concurrent.*;

/**
 *
 */
public class ThreadService {
    public void test() {
        /*
         * fixed 固定的 线程池以固定线程进行并发
         */
        // ExecutorService executorService = Executors.newFixedThreadPool(3);
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        // ScheduledExecutorService executorService =
        // Executors.newScheduledThreadPool(2);
        /**
         * OOM 错误，不可再创建线程 unable to create new native thread
         */
        // ExecutorService executorService = Executors.newCachedThreadPool();
        // Long.MAX_VALUE
        for (long i = 0; i < 10000; i++) {
            /*
             * 1、如果当前执行的线程数小于线程池核心数，就创建线程 加入到worker中(原子操作) 利用有限的work数限制并发量（由core限制）
             *
             */
            // executorService.execute(new CountRunnable(i));
            System.out.println("in:" + System.currentTimeMillis());
            executorService.execute(new CountRunnable(i));
        }
        executorService.shutdown();
        // executorService.
    }

    public static void main(String[] args) {
        ThreadService threadService = new ThreadService();
        threadService.test();
        // threadService.testSchedule();
        int availProcessors = Runtime.getRuntime().availableProcessors();
        System.out.println(Runtime.getRuntime().availableProcessors());
        System.out.println("avail processors count: " + availProcessors);
        System.out.println("running:" + (-1 << 28) + " " + Integer.toBinaryString(-1 << 28));
    }

    public void testSchedule() {
        ScheduledExecutorService executorService = Executors.newScheduledThreadPool(2);
        executorService.schedule(new CountRunnable(1), 10, TimeUnit.SECONDS);
        executorService.shutdown();
    }

    public class CountRunnable implements Runnable {
        long i;

        public CountRunnable(long i) {
            this.i = i;
        }

        @Override
        public void run() {
            System.out.println("run:" + System.currentTimeMillis());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i + " " + Thread.currentThread().getName());

        }
    }

    public void reuseThread() {
        Thread thread = new Thread();
        thread.run();
    }
}
