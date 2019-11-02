package com.github.songjiang951130.leetcode.array;

public class LeetCode4 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (nums1 == null && nums2 == null) {
            return 0;
        }
        if (nums1 == null || nums1.length == 0) {
            return median(nums2);
        }
        if (nums2 == null || nums2.length == 0) {
            return median(nums1);
        }
        boolean isEven = (nums1.length + nums2.length) % 2 == 0;
        int len = isEven ? nums1.length + nums2.length + 1 : nums1.length + nums2.length - 1;
        int i = 0, j = 0, index = 0;
        while (index < len  / 2) {
            if (nums1[i] < nums2[j]) {
                //last one
                if (i == nums1.length - 1) {
                    j++;
                } else {
                    i++;
                }
            } else {
                //last one
                if (j == nums2.length - 1) {
                    i++;
                } else {
                    j++;
                }
            }
            index++;
        }
        return isEven ? (nums1[i] + nums2[j]) / 2.0 : Math.min(nums1[i], nums2[j]);
    }

    private double median(int[] nums) {
        boolean isEven = nums.length % 2 == 0;
        return isEven ? (nums[nums.length / 2] + nums[nums.length / 2 - 1]) / 2.0 : nums[nums.length / 2];
    }
}
