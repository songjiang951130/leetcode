package com.github.songjiang951130.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class RangeFreqQuery {
    //value -> indexes
    Map<Integer, List<Integer>> map = new HashMap<>();

    public RangeFreqQuery(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            List<Integer> indexes = map.getOrDefault(arr[i], new ArrayList<>());
            indexes.add(i);
            map.put(arr[i], indexes);
        }
    }

    public int query(int left, int right, int value) {
        List<Integer> indexes = map.getOrDefault(value, new ArrayList<>());
        return (int) indexes.stream().filter(e -> e >= left && e <= right).count();
    }


}

/**
 * Your RangeFreqQuery object will be instantiated and called as such:
 * RangeFreqQuery obj = new RangeFreqQuery(arr);
 * int param_1 = obj.query(left,right,value);
 */