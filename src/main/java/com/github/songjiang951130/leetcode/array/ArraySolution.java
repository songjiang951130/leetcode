package com.github.songjiang951130.leetcode.array;

import com.github.songjiang951130.ioc.core.annotation.Autowired;
import com.github.songjiang951130.ioc.core.annotation.Component;

import java.util.*;

@Component
public class ArraySolution {
    @Autowired
    private String testField;

    @Autowired
    public Object object;

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i = 0, j = 0;
        int index = 0;
        int len = nums1.length + nums2.length;
        boolean isOdd = len % 2 == 1;
        while (index < (len - 1) / 2) {
            if (nums1[i] < nums2[j]) {
                i++;
            } else {
                j++;
            }
            index++;
        }
        return isOdd ? Math.min(nums1[i], nums2[j]) : (nums1[i] + nums2[j]) / 2.0;
    }

    public String getTestField() {
        return testField;
    }

    public int[] arrayRankTransform(int[] arr) {
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int rank = 1;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    rank++;
                }
            }
            result[i] = rank;
        }
        System.out.println(Arrays.toString(result));
        return result;
    }


    /**
     * @param cardPoints 数组
     * @param k 两端k个值
     * @return 最大值
     * @link https://leetcode.cn/problems/maximum-points-you-can-obtain-from-cards
     */
    public int maxScore(int[] cardPoints, int k) {
        int len = cardPoints.length - k;
        int sum = 0;
        int subSum = 0;
        for (int i = 0; i < cardPoints.length; i++) {
            sum += cardPoints[i];
            if (i < len) {
                subSum += cardPoints[i];
            }
        }
        if (k == cardPoints.length) {
            return sum;
        }
        int resMin = subSum;
        for (int i = len; i < cardPoints.length; i++) {
            subSum = subSum - cardPoints[i - len] + cardPoints[i];
            resMin = Math.min(subSum, resMin);
        }
        return sum - resMin;
    }

    /**
     * waring 此方案会超出内存限制
     * @param cardPoints 数组
     * @param k 两端k个值
     * @return 最大值
     */
    public int maxScoreByDepthFirst(int[] cardPoints, int k) {
        List<List<Integer>> res = new ArrayList<>();
        dfs(cardPoints, 0, cardPoints.length - 1, k, new ArrayList<>(), res);
        //list sum
        int resSum = 0;
        for (List<Integer> list : res) {
            int sum = 0;
            for (Integer integer : list) {
                sum += integer;
            }
            resSum = Math.max(sum, resSum);
        }
        return resSum;
    }


    private static void dfs(int[] arr, int left, int right, int k, List<Integer> path, List<List<Integer>> result) {
        if (k == 0) {
            result.add(new ArrayList<>(path)); // 将当前路径加入结果集
            return;
        }

        if (left < right) {
            // 从左边选择一个值
            path.add(arr[left]);
            dfs(arr, left + 1, right, k - 1, path, result);
            path.remove(path.size() - 1); // 回溯

            // 从右边选择一个值
            path.add(arr[right]);
            dfs(arr, left, right - 1, k - 1, path, result);
            path.remove(path.size() - 1); // 回溯
        } else if (left == right) {
            // 如果 left 和 right 相等，说明数组中只剩下一个值
            path.add(arr[left]);
            dfs(arr, left + 1, right - 1, k - 1, path, result);
            path.remove(path.size() - 1); // 回溯
        }
    }

}