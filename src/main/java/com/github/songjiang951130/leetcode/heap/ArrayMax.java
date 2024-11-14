package com.github.songjiang951130.leetcode.heap;

import java.util.LinkedList;
import java.util.Queue;

public class ArrayMax {

    /**
     * 思路记录：滑动窗口 打算用linked list。做队列，然后用生成一个队列最大值 max；
     * 出队的时候元素a 比较max 1、如果 a==max，重新生成队列最大值max；2、a < max 最大值存入res[] 3、a >max 不可能存在</>
     *
     * @param nums
     * @param k
     * @return
     */
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] sw = new int[k];
        int[] res = new int[nums.length - k + 1];
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < k; i++) {
            sw[i] = nums[i];
            max = Math.max(max, sw[i]);
        }
        int index = 0;
        res[index++] = max;

        for (int i = k; i < nums.length; i++) {
            int num = nums[i];
            int offer = offer(sw);
            add(sw, num);

            if (offer == max) {
                max = getMax(sw);
            } else if (num > max) {
                max = num;
            }
            res[index++] = max;
        }
        return res;
    }

    private int getMax(int[] array) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            max = Math.max(max, array[i]);
        }
        return max;
    }

    private int offer(int[] array) {
        int res = array[0];
        for (int i = 0; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }
        return res;
    }

    private void add(int[] array, int val) {
        array[array.length - 1] = val;
    }
}
