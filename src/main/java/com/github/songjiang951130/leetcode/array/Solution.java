package com.github.songjiang951130.leetcode.array;

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
}