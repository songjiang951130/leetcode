package com.github.songjiang951130.leetcode.queue;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] res = new int[nums.length - k + 1];
        List<Integer> queue = new ArrayList<>();
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (queue.size() < k) {
                queue.add(nums[i]);
            } else {
                int max = Integer.MIN_VALUE;
                for (int l = 0; l < k; l++) {
                    max = Integer.max(queue.get(l), max);
                }
                res[j] = max;
                queue.remove(0);
            }
        }
        return res;
    }
}