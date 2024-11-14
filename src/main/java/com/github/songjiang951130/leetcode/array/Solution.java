package com.github.songjiang951130.leetcode.array;

import java.util.ArrayList;
import java.util.Arrays;
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
        for (int i = 0; i < nums.length - 2; i++) {
            //优化当前值大于0，说明前后之合数已经大于0
            if (nums[i] > 0) {
                break;
            }
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int s = i + 1;
            int e = nums.length - 1;
            while (s < e) {
                int sum = nums[i] + nums[s] + nums[e];
                if (sum == 0) {
                    res.add(new ArrayList<Integer>(Arrays.asList(nums[i], nums[s], nums[e])));
                    //跳过element重复数据
                    while (s < e && nums[s] == nums[++s]) ;
                    while (s < e && nums[e] == nums[--e]) ;
                } else if (sum < 0) {
                    while (s < e && nums[s] == nums[++s]) ;
                } else {
                    while (s < e && nums[e] == nums[--e]) ;
                }
            }
        }
        return res;
    }


    public int maxAbsoluteSum(int[] nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int maxPre = 0;
        int minPre = 0;
        for (int i = 0; i < nums.length; i++) {
            maxPre += nums[i];
            minPre += nums[i];
            if (maxPre < 0) {
                maxPre = 0;
            }
            if (minPre > 0) {
                minPre = 0;
            }
            max = Math.max(max, maxPre);
            min = Math.min(min, minPre);
        }
        return Math.max(max, Math.abs(min));
    }

}