package com.github.songjiang951130.leetcode.offer;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Set;

public class Offer48 {
    /**
     * beat 11,有点拉跨
     *
     * @param s
     * @return
     */
    public int lengthOfLongestSubstring(String s) {
        int res = 0;
        Set<Character> set = new HashSet<>();
        int start = 0;
        for (int i = 0; i < s.length(); ) {
            char c = s.charAt(i);
            while (set.contains(c)) {
                set.remove(s.charAt(start));
                start++;
            }

            set.add(c);
            res = Math.max(res, i - start + 1);
            i++;
        }
        return res;
    }

    /**
     * 采用双端队列解决问题
     *
     * @return
     */
    public int lengthOfLongestSubstringV2(String s) {
        int res = 0;
        Deque<Character> deque = new ArrayDeque<>();
        int start = 0;
        for (int i = 0; i < s.length(); ) {
            char c = s.charAt(i);
            while (deque.contains(c)) {
                deque.poll();
                start++;
            }
            deque.offer(c);
            res = Math.max(res, i - start + 1);
            i++;
        }
        return res;
    }

}
