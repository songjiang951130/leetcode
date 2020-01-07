package com.github.songjiang951130.leetcode.dfs;

import java.util.ArrayList;
import java.util.List;

/**
 * Combine leetcode 77 medium
 * 
 * 组合问题
 */
public class Combine {

    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        if (n <= 0 || k <= 0 || n < k) {
            return result;
        }
        dfs(result, new ArrayList<>(), n, k, 1);
        return result;
    }

    /**
     * 如何解决数据重复的问题 比如 22，33，44
     */
    public void dfs(List<List<Integer>> result, List<Integer> list, int n, int k, int start) {
        if (list.size() == k) {
            result.add(new ArrayList<>(list));
            return;
        }
        for (int i = start; i <= n - (k - list.size()) + 1; i++) {
            list.add(i);
            // i+1,避免重复数据问题
            dfs(result, list, n, k, i + 1);
            list.remove(list.size() - 1);
        }
    }
}