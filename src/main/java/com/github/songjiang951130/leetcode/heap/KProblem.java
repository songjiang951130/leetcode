package com.github.songjiang951130.leetcode.heap;


import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * 寻找第k大的数 https://leetcode-cn.com/problems/kth-largest-element-in-an-array/
 */
public class KProblem {

    public int findKthLargest(int[] nums, int k) {
        // Comparator.comparingInt(n -> n)
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int i = 0; i < nums.length; i++) {
            minHeap.add(nums[i]);
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }
        return minHeap.poll();
    }

    /**
     * [1,1,1,2,2,3], k = 2
     * //输出: [1,2]
     * @param nums
     * @param k
     * @return
     */
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        PriorityQueue<Element> priorityQueue = new PriorityQueue<>();
        for (Map.Entry<Integer, Integer> mapEntry : map.entrySet()) {
            if (priorityQueue.size() < k) {
                priorityQueue.add(new Element(mapEntry.getKey(), mapEntry.getValue()));
            } else {
                Element element = priorityQueue.peek();
                if (element.getCount() < mapEntry.getValue()) {
                    priorityQueue.poll();
                    priorityQueue.add(new Element(mapEntry.getKey(), mapEntry.getValue()));
                }
            }
        }


        int[] res = new int[k];
        int i = 0;
        while (!priorityQueue.isEmpty()) {
            res[i] = priorityQueue.poll().getVal();
            i++;
        }
        return res;
    }

    class Element implements Comparable<Element> {
        private int val;
        private int count;

        public Element(int val, int count) {
            this.val = val;
            this.count = count;
        }

        public int getVal() {
            return val;
        }

        public int getCount() {
            return count;
        }

        @Override
        public int compareTo(Element o) {
            return this.count - o.count;
        }
    }
}
