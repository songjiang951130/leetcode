package com.github.songjiang951130.leetcode.backtrack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Permutations {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backTrace(nums, result, new ArrayList<>());
        return result;
    }

    private void backTrace(int[] nums, List<List<Integer>> result, List<Integer> save) {
        if (save.size() == nums.length) {
            result.add(new ArrayList<>(save));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (save.contains(nums[i])) {
                continue;
            }
            save.add(nums[i]);
            backTrace(nums, result, save);
            save.remove(save.size() - 1);
        }
    }

    /**
     * 1 1 2 重复数字
     *
     * @param nums
     * @return
     */
    public List<List<Integer>> permute2(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        backTrace2(nums, result, new ArrayList<>(), new boolean[nums.length]);
        return result;
    }

    private void backTrace2(int[] nums, List<List<Integer>> result, List<Integer> save, boolean[] used) {
        if (save.size() == nums.length) {
            result.add(new ArrayList<>(save));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (used[i] || i > 0 && used[i - 1] && nums[i - 1] == nums[i]) {
                continue;
            }
            used[i] = true;
            save.add(nums[i]);
            backTrace2(nums, result, save, used);
            save.remove(save.size() - 1);
            used[i] = false;
        }
    }


}
