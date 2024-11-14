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

    @Test
    public void testString() {
        String case1 = "race a car";
        String case2 = "A man, a plan, a canal: Panama";
        String case3 = "A@";
        String case4 = "0p";
        boolean palindrome = isPalindrome(case1);
        assert !palindrome;

        palindrome = isPalindrome(case2);
        assert palindrome;
        palindrome = isPalindrome(case3);
        assert palindrome;

        palindrome = isPalindrome(case4);
        assert !palindrome;

    }


    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.toCharArray().length; i++) {
            char c = s.toCharArray()[i];
            if(c<='z'&& c>='a'  || c>='0'&& c<='9'){
                sb.append(c);
            }

            if(c<='Z'&& c>='A'){
                sb.append((char) (c+ 'a'-'A'));
            }
        }
        char[] chars = sb.toString().toCharArray();
        int mid = chars.length % 2 == 1 ? chars.length / 2 : chars.length / 2 - 1;
        for (int i = 0; i <= mid; i++) {
            if (chars[i] != chars[chars.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }

}
