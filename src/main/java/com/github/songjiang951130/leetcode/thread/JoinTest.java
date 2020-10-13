package com.github.songjiang951130.leetcode.thread;

public class JoinTest {
    /**
     * 测试 join 让线程顺序执行
     * @param args
     */
    public static void main(String[] args) {
        Thread threadA = new Thread(new WorkThread(),"threadA");
        Thread threadB = new Thread(new WorkThread(),"threadB");
        threadA.start();
        threadB.start();
        try {
            threadB.join();
            threadA.join();
        } catch (InterruptedException interruptedException) {
            interruptedException.printStackTrace();
        }
        System.out.println(Thread.currentThread()+" end");
    }
}
