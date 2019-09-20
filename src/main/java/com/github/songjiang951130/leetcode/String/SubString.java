package com.github.songjiang951130.leetcode.String;

import java.util.HashMap;

public class SubString {

    /**
     * tips:
     * 1、hashmap做保存 char 和 index
     * 2、
     * @param s
     * @return
     */
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        char[] array = s.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        int max = 0;
        for (int i = 0, j = 0; i < array.length; i++) {
            if (map.containsKey(array[i])) {
                //
                j = Math.max(j, map.get(array[i]) + 1);
            }
            map.put(array[i], i);
            max = Math.max(max, i - j + 1);
        }
        return max;
    }
}
