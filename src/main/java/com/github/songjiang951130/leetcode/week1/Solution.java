package com.github.songjiang951130.leetcode.week1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class Solution {
    public String reformat(String s) {
        LinkedList<Character> characters = new LinkedList<>();
        LinkedList<Character> numbers = new LinkedList<>();
        for (char ch : s.toCharArray()) {
            if (ch >= '0' && ch <= '9') {
                numbers.add(ch);
            }
            if (ch >= 'a' && ch <= 'z') {
                characters.add(ch);
            }
        }

        if (Math.abs(characters.size() - numbers.size()) > 1) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        boolean first = characters.size() > numbers.size();
        while (!characters.isEmpty() && !numbers.isEmpty()) {
            if (first) {
                sb.append(characters.poll());
            } else {
                sb.append(numbers.poll());
            }
            first = !first;
        }
        if (!characters.isEmpty()) {
            sb.append(characters.poll());
        }
        if (!numbers.isEmpty()) {
            sb.append(numbers.poll());
        }
        return sb.toString();

    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        dfs(res, temp, 0, 0, target, candidates);
        return res;
    }

    public void dfs(List<List<Integer>> res, List<Integer> temp, int start, int sum, int target, int[] candidates) {
        if (sum > target) {
            return;
        }
        if (sum == target) {
            res.add(new ArrayList<>(temp));
        }
        for (int i = start; i < candidates.length; i++) {
            temp.add(candidates[i]);
            dfs(res, temp, i, sum + candidates[i], target, candidates);
            temp.remove(temp.size() - 1);
        }
    }
}