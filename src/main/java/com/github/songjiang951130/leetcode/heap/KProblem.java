package com.github.songjiang951130.leetcode.heap;

import java.util.PriorityQueue;

/**
 * 寻找第k大的数
 * https://leetcode-cn.com/problems/kth-largest-element-in-an-array/
 */
public class KProblem {

    public int findKthLargest(int[] nums, int k) {
        //Comparator.comparingInt(n -> n)
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int i = 0; i < nums.length; i++) {
            minHeap.add(nums[i]);
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }
        return minHeap.poll();
    }
}
