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
     * @param s
     * @param e
     * @return 返回基准点的下标
     */
    private int partion(int[] array, int s, int e) {
        // 选择第一个为基准点
        int temp = array[s];
        while (s < e) {
            // 找到右边第一个小于tmp的下标
            while (s < e && temp <= array[e]) {
                e--;
            }
            // 此时小于这个值和基准点位置互换
            array[s] = array[e];
            // 此时左侧开始查找
            while (s < e && temp >= array[s]) {
                s++;
            }
            array[e] = array[s];
        }
        array[e] = temp; // 此时s==e
        return e;
    }

    private void swap(int[] array, int s, int e) {
        int t = array[s];
        array[s] = array[e];
        array[e] = t;
    }
}