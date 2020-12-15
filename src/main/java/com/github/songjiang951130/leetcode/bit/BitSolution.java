package com.github.songjiang951130.leetcode.bit;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 位运算篇
 */
class Solution {
    /**
     * 数组中其他数出现两次，仅有一个数出现一次。找出仅出现一次的数
     *
     * @param nums
     * @return
     */
    public int singleNumber(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        int res = nums[0];
        for (int i = 1; i < nums.length; i++) {
            res ^= nums[i];
        }
        return res;
    }

    /**
     * testCase  nums:2,2,3,2,res:3
     * @param nums
     * @return
     */
    public int singleNumber2(int[] nums) {
        Set<Integer> set = new HashSet<>(nums.length);
        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            boolean res = set.add(nums[i]);
            if (!res) {
                map.put(nums[i], 2);
            }
        }

        for (int i : set) {
            if (map.containsKey(i)) {
                sum -= i * 3;
            }
        }
        return sum;
    }

}
