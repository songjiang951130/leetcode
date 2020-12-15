package com.github.songjiang951130.leetcode.backtrack;

import java.util.ArrayList;
import java.util.List;

public class Money {

    public List<List<Integer>> handle(int[] array, int target) {
        List<List<Integer>> result = new ArrayList<>();
        backTrace(array, target, 0, result, new ArrayList<>());
        return result;
    }

    private void backTrace(int[] array, int target, int index, List<List<Integer>> result, List<Integer> save) {
        if (target == 0) {
            result.add(new ArrayList<>(save));
            return;
        }
        for (int i = index; i < array.length; i++) {
            if (target - array[i] < 0) {
                continue;
            }
            // 只返回一个值
            if (result.size() == 1) {
                return;
            }
            save.add(array[i]);
            backTrace(array, target - array[i], i + 1, result, save);
            save.remove(save.size() - 1);
        }
    }

}