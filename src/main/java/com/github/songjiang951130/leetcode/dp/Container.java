package com.github.songjiang951130.leetcode.dp;

/**
 * @link https://leetcode-cn.com/problems/container-with-most-water/
 */
public class Container {
    public int maxArea(int[] height) {
        int max = 0;
        int i = 0, j = height.length - 1;
        while (i < j) {
            //从两边向内进行判断,最大盛水量由最小高度决定，小的一边需要往内移动
            int h = height[i] < height[j] ? height[i++] : height[j--];
            max = Math.max(max, h * (j - i + 1));
        }
        return max;
    }

    /**
     * @param height
     * @return
     */
    private int bf(int[] height) {
        int max = 0;
        for (int i = 0; i < height.length; i++) {
            for (int j = i + 1; j < height.length; j++) {
                max = Math.max(max, (j - i) * Math.min(height[i], height[j]));
            }
        }
        return max;
    }
}