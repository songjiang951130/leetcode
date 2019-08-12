package com.github.songjiang951130.leetcode.array;

import com.github.songjiang951130.ioc.core.annotation.Component;

@SuppressWarnings("unchecked")
@Component
public class ArraySolution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i = 0, j = 0;
        int index = 0;
        int len = nums1.length + nums2.length;
        boolean isOdd = len % 2 == 1;
        while (index < (len - 1) / 2) {
            if (nums1[i] < nums2[j]) {
                i++;
            } else {
                j++;
            }
            index++;
        }
        return isOdd ? Math.min(nums1[i], nums2[j]) : (nums1[i] + nums2[j]) / 2.0;
    }
}