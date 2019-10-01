package com.github.songjiang951130.leetcode.backtrack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
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

    /**
     * case [10,1,2,7,6,1,5], target = 8,
     * result:
     * [
     * [1, 7],
     * [1, 2, 5],
     * [2, 6],
     * [1, 1, 6]
     * ]
     *
     * @param candidates
     * @param target
     * @return
     */
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates); // 此处排序为了去重 作准备
        backTrace2(candidates, target, result, new ArrayList<>(), 0);
        return result;

    }


    private void backTrace2(int[] candidates, int target, List<List<Integer>> result, List<Integer> save, int index) {
        if (0 == target) {
            //save 是引用类型，其他调用栈会影响该值
            result.add(new ArrayList<>(save));
            return;
        }

        for (int i = index; i < candidates.length; i++) {
            //去重 此处放前面运行更快 比如 1,1,7  凑8; 第二个1 直接跳过
            if (i > index && candidates[i] == candidates[i - 1]) {
                continue;
            }
            //去除不合法的情况
            if (target - candidates[i] < 0) {
                continue;
            }
            save.add(candidates[i]);
            backTrace2(candidates, target - candidates[i], result, save, i + 1);
            //新加入的元素移除 继续回溯
            save.remove(save.size() - 1);
        }
    }

    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        backTraceCombine(n, k, 1, result, new ArrayList<>());
        return result;
    }

    private void backTraceCombine(int n, int length, int start, List<List<Integer>> result, List<Integer> save) {
        if (save.size() > length) {
            return;
        }
        if (save.size() == length) {
            result.add(new ArrayList<>(save));
            return;
        }


        for (int i = start; i <= n; i++) {
            save.add(i);
            backTraceCombine(n, length, i + 1, result, save);
            save.remove(save.size() - 1);
        }
    }

    /**
     * n= 4 k = 2
     * 1 2 3 4
     * 2 3 4
     * 3 4
     *
     * @param n
     * @param k
     * @return
     */
    public List<List<Integer>> combineFastest(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {

                System.out.println(i + " " + j + " ");
            }
            System.out.println();
        }

        return result;
    }




}
