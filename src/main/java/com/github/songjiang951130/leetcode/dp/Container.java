package com.github.songjiang951130.leetcode.dp;

/**
 * @link https://leetcode-cn.com/problems/container-with-most-water/
 */
public class Container {
    public int maxArea(int[] height) {
        int max = 0;
        int i = 0, j = height.length - 1;
        while (i < j) {
            /**
             * 从两边向内进行判断,最大盛水量的高度由两边高度的较小（最小）高度决定，小的一边需要往内移动，找更大的边和当前的宽度进行计算面积
             */
            int h = height[i] < height[j] ? height[i++] : height[j--];
            // 此处已经往里面挪动了一位，所以要加1补一个长度
            max = Math.max(max, h * (j - i + 1));
        }
        return max;
    }
}