package com.github.songjiang951130.leetcode.water;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * https://leetcode-cn.com/contest/weekly-contest-156/problems/unique-number-of-occurrences/
 */
public class UniqueOccurrence {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer,Integer> map = new HashMap<>();

        for(int i : arr){
            int times = 1;
            if(map.containsKey(i)){
                times += map.get(i);
            }
            map.put(i,times);
        }

        Set<Integer> record = new HashSet<>();
        for(Integer i : map.values()){
            if(record.contains(i)){
                return false;
            }
            record.add(i);
        }
        return true;
    }
}
