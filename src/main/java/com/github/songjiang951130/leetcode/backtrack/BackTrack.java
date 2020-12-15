package com.github.songjiang951130.leetcode.backtrack;

import java.util.ArrayList;
import java.util.List;

public class BackTrack {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        backtrackV2(res, nums, new ArrayList<>(), new boolean[nums.length + 1]);
        return res;
    }

    /**
     * 数字 1,2,3,,,n,第k个的全排列
     *
     * @param n
     * @param k
     * @return
     */
    public String getPermutation(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        int[] nums = new int[n];
        for (int i = 1; i <= n; i++) {
            nums[i - 1] = i;
        }
        backtrackV2(res, nums, new ArrayList<>(), new boolean[nums.length + 1], k);
        StringBuilder sb = new StringBuilder();
        for (Integer i : res.get(k - 1)) {
            sb.append(i);
        }
        return sb.toString();
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
    private void backtrackV2(List<List<Integer>> res, int[] nums, List<Integer> save, boolean[] visited) {
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

    /**
     * beat time 99
     * beat space 49
     *
     * @param res
     * @param nums
     * @param save
     * @param visited
     */
    private void backtrackV2(List<List<Integer>> res, int[] nums, List<Integer> save, boolean[] visited, int k) {
        if (k == res.size()) {
            return;
        }
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
            backtrackV2(res, nums, save, visited, k);
            visited[i] = false;
            save.remove(save.size() - 1);
        }
    }
}
