package com.github.songjiang951130.leetcode.array;

import com.github.songjiang951130.ioc.core.annotation.Autowired;
import com.github.songjiang951130.ioc.core.annotation.Component;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

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
     * @param cardPoints
     * @param k
     * @return
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
}