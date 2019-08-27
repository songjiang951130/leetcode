package com.github.songjiang951130.leetcode.backtrack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subset {

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backTrace(nums, 0, new ArrayList<>(), result);
        return result;

    }

    private void backTrace(int[] nums, int start, List<Integer> save, List<List<Integer>> result) {
        result.add(new ArrayList<>(save));
        for (int i = start; i < nums.length; i++) {
            save.add(nums[i]);
            backTrace(nums, i + 1, save, result);
            save.remove(save.size() - 1);
        }
    }

    /**
     * 有重复数字
     * @param nums
     * @return
     */
    public List<List<Integer>> subsets2(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        backTrace2(nums, 0, new ArrayList<>(), result);
        return result;

    }

    private void backTrace2(int[] nums, int start, List<Integer> save, List<List<Integer>> result) {
        result.add(new ArrayList<>(save));
        for (int i = start; i < nums.length; i++) {
            // 去除重复元素
            if (i > start && nums[i] == nums[i - 1]) continue; // skip duplicates
            save.add(nums[i]);
            backTrace2(nums, i + 1, save, result);
            save.remove(save.size() - 1);
        }
    }


}
