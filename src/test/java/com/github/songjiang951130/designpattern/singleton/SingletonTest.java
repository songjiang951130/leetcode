package com.github.songjiang951130.designpattern.singleton;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;

public class SingletonTest {
    List<Singleton> list;

    @Test
    public void test() {
        int threadCount = 100;
        list = new ArrayList<Singleton>(threadCount);
        CountDownLatch countDownLatch = new CountDownLatch(threadCount);
        for (int i = 0; i < threadCount; i++) {
            new Thread(new work(countDownLatch)).start();
        }

        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Singleton singleton = null;
        for (Singleton element : list) {
            if (singleton == null) {
                singleton = element;
                continue;
            }
            Assert.assertEquals(singleton, element);
            singleton = element;
            System.out.println(element);
        }
        list = null;
    }

    public class work implements Runnable {
        CountDownLatch countDownLatch;

        public work(CountDownLatch countDownLatch) {
            this.countDownLatch = countDownLatch;
        }

        @Override
        public void run() {
            Singleton singleton = Singleton.getInstance();
            list.add(singleton);
            countDownLatch.countDown();
        }
    }
}
