package com.github.songjiang951130.leetcode.map;

import java.util.HashMap;
import java.util.Map;

class Leetcode242 {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }

        }

        for (char c : t.toCharArray()) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) - 1);
            } else {
                map.put(c, -1);
            }
        }

        for (Integer value : map.values()) {
            if (value != 0) {
                return false;
            }
        }
        return true;
    }


}