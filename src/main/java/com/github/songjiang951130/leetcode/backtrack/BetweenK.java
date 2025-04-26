package com.github.songjiang951130.leetcode.backtrack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BetweenK {

    public long countSubArrays(int[] nums, int minK, int maxK) {
        int count = 0;
        int n = nums.length;
        for (int start = 0; start < n; start++) {
            List<Integer> temp = new ArrayList<>();
            int tempMax = Integer.MIN_VALUE;
            int tempMin = Integer.MAX_VALUE;
            for (int idx = start; idx < n; idx++) {
                int val = nums[idx];
                if (val < minK || val > maxK) {
                    break;
                }
                tempMax = Math.max(tempMax, val);
                tempMin = Math.min(tempMin, val);
                temp.add(nums[idx]);
                if (tempMax == maxK && tempMin == minK) {
//                    System.out.println(temp);
                    count++;
                }
            }
        }
        return count;
    }

    public long countSubArraysV2(int[] nums, int minK, int maxK) {
        int count = 0;
        int n = nums.length;
        int minIdx = -1;
        int maxIdx = -1;
        int subStart = -1;
        for (int i = 0; i < n; i++) {
            int val = nums[i];
            if (val < minK || val > maxK) {
                minIdx = -1;
                maxIdx = -1;
                subStart = i;
                continue;
            }
            if (val == maxK) {
                maxIdx = i;
            }
            if (val == minK) {
                minIdx = i;
            }
            //最大、最小值下标相对有移动
            if (maxIdx != -1 && minIdx != -1) {
                System.out.println("count: " + count + " Math.min(maxIdx, minIdx) - subStart:"+(Math.min(maxIdx, minIdx) - subStart));
                count += Math.min(maxIdx, minIdx) - subStart;
                System.out.println(Arrays.toString(Arrays.copyOfRange(nums, subStart + 1, i + 1)));
            }
        }
        return count;
    }
}
