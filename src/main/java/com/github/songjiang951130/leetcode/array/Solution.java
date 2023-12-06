package com.github.songjiang951130.leetcode.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        //此处已经考虑到 nums=[1]
        int len = nums.length;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                len--;
                //last duplicate
                if (i + 1 == nums.length) {
                    break;
                }
            }
        }
        return len;
    }

    /**
     * 三数之和，超时了
     *
     * @param nums 数组
     * @return 三数之和
     */
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            //优化当前值大于0，说明前后之合数已经大于0
            if (nums[i] > 0) {
                break;
            }
            int s = i + 1;
            int e = nums.length - 1;
            while (s < e) {
                int sum = nums[i] + nums[s] + nums[e];
                if (sum == 0) {
                    List<Integer> el = new ArrayList<>();
                    el.add(nums[i]);
                    el.add(nums[s]);
                    el.add(nums[e]);
                    if (!res.contains(el)) {
                        res.add(el);
                    }
                    s++;
                    e--;
                } else if (sum < 0) {
                    s++;
                } else {
                    e--;
                }
            }
        }
        return res;
    }
}