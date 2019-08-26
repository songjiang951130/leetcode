package com.github.songjiang951130.leetcode.backtrack;

import java.util.ArrayList;
import java.util.List;

public class Money {

    public List<List<Integer>> handle(int[] array, int target) {
        List<List<Integer>> result = new ArrayList<>();
        backTrace(array, target, 0, result, new ArrayList<>());
        return result;
    }

    public void backTrace(int[] array, int target, int index, List<List<Integer>> result, List<Integer> save) {
        if (target == 0) {
            result.add(new ArrayList<>(save));
            return;
        }
        System.out.println("target:" + target + " index:" + index);
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

    public static void main(String[] args) {
        Money money = new Money();
        List<List<Integer>> result = money.handle(new int[]{10, 10, 20, 40, 60, 120}, 100);
        System.out.println(result);
    }
}