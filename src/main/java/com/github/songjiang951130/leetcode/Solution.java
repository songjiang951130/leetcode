package com.github.songjiang951130.leetcode;
/*
 * @lc app=leetcode id=15 lang=java
 *
 * [15] 3Sum
 */

import java.util.*;

class Solution {
    /**
     * case1: [-1, 0, 1, 2, -1, -4] result: [ [-1, 0, 1], [-1, -1, 2] ]
     *
     * @param nums
     * @return
     */
    public List<List<Integer>> threeSum(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; i < nums.length && j != i; j++) {
                System.out.println(nums[i] + " " + nums[j]);
            }
        }
        return null;
    }

    public String removeDuplicates(String S) {
        Stack<Character> stack = new Stack<>();
        for (char c : S.toCharArray()) {
            if (stack.isEmpty()) {
                stack.push(c);
                continue;
            }
            Character p = stack.peek();
            if (c == p) {
                stack.pop();
            } else {
                stack.push(c);
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        while (!stack.isEmpty()) {
            stringBuilder.append(stack.pop());
        }
        return stringBuilder.reverse().toString();
    }


}
