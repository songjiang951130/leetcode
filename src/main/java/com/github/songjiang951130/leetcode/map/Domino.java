package com.github.songjiang951130.leetcode.map;

import java.util.HashMap;
import java.util.Map;

public class Domino {

    public int numEquivDominoPairs(int[][] dominoes) {
        if (dominoes == null || dominoes.length == 1) {
            return 0;
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < dominoes.length; i++) {
            int small = dominoes[i][0] < dominoes[i][1] ? dominoes[i][0] : dominoes[i][1];
            int big = dominoes[i][0] > dominoes[i][1] ? dominoes[i][0] : dominoes[i][1];
            if (map.containsKey(small * 10 + big)) {
                map.put(small * 10 + big, map.get(small * 10 + big) + 1);
            } else {
                map.put(small * 10 + big, 1);
            }
        }
        int result = 0;
        for (Integer i : map.values()) {
            result += i * (i - 1) / 2;
        }
        return result;
    }
}