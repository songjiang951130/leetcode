package com.github.songjiang951130.leetcode.dp;

/**
 * @link https://leetcode-cn.com/problems/container-with-most-water/
 */
public class Container {
    public int maxArea(int[] height) {
        int max = 0;
        for (int i = 0; i < height.length; i++) {
            for (int j = i + 1; j < height.length; j++) {
                max = Math.max(max, (j - i) * Math.min(height[i], height[j]));
            }
        }
        return max;
    }
}