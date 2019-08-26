package com.github.songjiang951130.leetcode.backtrack;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    /**
     * case 1:
     * Input: candidates = [2,3,6,7], target = 7,
     * A solution set is:
     * [
     * [7],
     * [2,2,3]
     * ]
     *
     * @param candidates
     * @param target
     * @return
     */
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        backTrace(candidates, target, result, new ArrayList<>(), 0);
        return result;
    }

    private void backTrace(int[] candidates, int target, List<List<Integer>> result, List<Integer> save, int index) {
        if (0 == target) {
            //save 是引用类型，其他调用栈会影响该值
            result.add(new ArrayList<>(save));
            return;
        }

        for (int i = index; i < candidates.length; i++) {
            //加速 去除不合法的情况
            if (target - candidates[i] < 0) {
                continue;
            }
            save.add(candidates[i]);
            backTrace(candidates, target - candidates[i], result, save, i);
            //新加入的元素移除 继续回溯
            save.remove(save.size() - 1);
        }
    }
}
