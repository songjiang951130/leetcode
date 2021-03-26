package com.github.songjiang951130.leetcode.array;

import java.util.Arrays;

public class ArrayQuickSort {

    public int[] sort(int[] array) {
        quickSort(array, 0, array.length - 1);
        return array;
    }

    private void quickSort(int[] array, int s, int e) {
        if (s > e) {
            return;
        }
        System.out.println(Arrays.toString(array));
        int index = partition(array, s, e);
        quickSort(array, s, index - 1);
        quickSort(array, index + 1, e);
    }

    /**
     * 已基准点，将数据分为两部分
     *
     * @param array
     * @param start
     * @param end
     * @return 返回基准点的下标
     */
    private int partition(int[] array, int start, int end) {
        // 选择第一个为基准点
        int temp = array[start];
        while (start < end) {
            /**
             * 从右往左跳过所有大于基准点的值（即找到右侧第一个小于基准值的下标）
             */
            while (start < end && array[end] >= temp) {
                end--;
            }
            // 此时小于这个值和基准点位置互换
            array[start] = array[end];
            //（即找到右侧第一个大于基准值的下标）
            while (start < end && temp >= array[start]) {
                start++;
            }
            array[end] = array[start];
        }
        array[end] = temp; // 此时s==e
        return end;
    }
}