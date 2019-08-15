package com.github.songjiang951130.leetcode.water;

import java.util.HashSet;
import java.util.Set;

public class Leetcode771 {
    public int numJewelsInStones(String J, String S) {
        //此处应该用set，而不是map
        Set<Character> set = new HashSet<Character>();
        for (char c : J.toCharArray()) {
            set.add(c);
        }
        int res = 0;
        for (char c : S.toCharArray()) {
            if (set.contains(c)) {
                res++;
            }
        }
        return res;
    }
}
