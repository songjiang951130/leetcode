package com.github.songjiang951130.leetcode.array;

import java.util.Arrays;

public class ArraySortCopy {

    public int[] sort(int[] nums) {
        quickSort(nums, 0, nums.length - 1);
        return nums;
    }

    public void quickSort(int[] nums, int start, int end) {
        if (start > end) {
            return;
        }
        System.out.println(Arrays.toString(nums));
        int i = partion(nums, start, end);
        quickSort(nums, start, i - 1);
        quickSort(nums, i + 1, end);
    }

    private int partion(int[] nums, int start, int end) {
        int key = nums[start];
        while (start < end) {
            //右侧值小于
            while (key <= nums[end] && start < end) {
                end--;
            }
            nums[start] = nums[end];
            while (key >= nums[start] && start < end) {
                start++;
            }
            nums[end] = nums[start];
        }
        nums[start] = key;
        return start;
    }
}
