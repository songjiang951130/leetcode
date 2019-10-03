package com.github.songjiang951130.test;

import com.github.songjiang951130.leetcode.concurrent.Count;
import com.github.songjiang951130.leetcode.concurrent.IntRunnable;
import com.github.songjiang951130.leetcode.concurrent.IntSynRunnable;
import org.junit.Test;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class MapTest {

    @Test
    public void testMap() {
        /**
         * jdk 1.8 初识容量为 16 并且在第一次put会设置
         */
        HashMap<String, String> hashMap = new HashMap<>();

        hashMap.put("ss", "vvv");
        String val = hashMap.get("ss");
        ConcurrentHashMap<String, String> concurrentHashMap = new ConcurrentHashMap<>();
        concurrentHashMap.put("c", "aa");
        concurrentHashMap.get("c");
        System.out.println("over" + val);
    }

    @Test
    public void cas() {
        AtomicInteger atomicInteger = new AtomicInteger(100);
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            new Thread(new IntRunnable(atomicInteger, start)).start();
        }
    }

    @Test
    public void sync() {
        Count count = new Count(100);
        long start2 = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            new Thread(new IntSynRunnable(count, start2)).start();
        }
    }

}
