package com.github.songjiang951130.leetcode.array;

import java.util.Arrays;

public class ArraySort {

    public int[] sort(int[] array) {
        qSort(array, 0, array.length - 1);
        return array;
    }

    private void qSort(int[] array, int s, int e) {
        if (s > e) {
            return;
        }
        System.out.println(Arrays.toString(array));
        int index = partion(array, s, e);
        qSort(array, s, index - 1);
        qSort(array, index + 1, e);
        // System.out.println(Arrays.toString(array));
    }

    /**
     * 已基准点，将数据分为两部分
     *
     * @param array
     * @param start
     * @param end
     * @return 返回基准点的下标
     */
    private int partion(int[] array, int start, int end) {
        // 选择第一个为基准点
        int temp = array[start];
        while (start < end) {
            /**
             * 跳过所有大于基准点的值
             */
            while (start < end && array[end] >= temp) {
                end--;
            }
            // 此时小于这个值和基准点位置互换
            array[start] = array[end];
            // 此时左侧开始查找
            while (start < end && temp >= array[start]) {
                start++;
            }
            array[end] = array[start];
        }
        array[end] = temp; // 此时s==e
        return end;
    }

    private void swap(int[] array, int s, int e) {
        int t = array[s];
        array[s] = array[e];
        array[e] = t;
    }
}