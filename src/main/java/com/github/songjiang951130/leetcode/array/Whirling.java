package com.github.songjiang951130.leetcode.array;

public class Whirling {
    public void rotate(int[] nums, int k) {
        if (k == 0) {
            return;
        }
        k = k % nums.length;
        reverse(nums, 0, nums.length - k - 1);
        reverse(nums, nums.length - k, nums.length - 1);
        reverse(nums, 0, nums.length - 1);
    }

    public void reverse(int[] array, int start, int end) {
        int tempEnd = end;
        System.out.println("end+start/2:" + ((end + start) / 2));
        for (int s = start; s <= (end + start) / 2; s++) {
            System.out.println(s + " " + end);
            int t = array[s];
            array[s] = array[tempEnd];
            array[tempEnd] = t;
            tempEnd--;
        }
    }
}
