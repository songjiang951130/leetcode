package com.github.songjiang951130.leetcode.backtrack;

import java.util.ArrayList;
import java.util.List;

public class BackTrack {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        backtrackV2(res, nums, new ArrayList<>(), new boolean[nums.length + 1]);
        return res;
    }

    public void backtrack(List<List<Integer>> res, int[] nums, List<Integer> save) {
        if (save.size() == nums.length) {
            res.add(new ArrayList<>(save));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (save.contains(nums[i])) {
                continue;
            }
            save.add(nums[i]);
            backtrack(res, nums, save);
            save.remove(save.size() - 1);
        }
    }

    /**
     * beat time 99
     * beat space 49
     *
     * @param res
     * @param nums
     * @param save
     * @param visited
     */
    public void backtrackV2(List<List<Integer>> res, int[] nums, List<Integer> save, boolean[] visited) {
        if (save.size() == nums.length) {
            res.add(new ArrayList<>(save));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (visited[i]) {
                continue;
            }
            save.add(nums[i]);
            visited[i] = true;
            backtrackV2(res, nums, save, visited);
            visited[i] = false;
            save.remove(save.size() - 1);
        }
    }
}
