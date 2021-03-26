package com.github.songjiang951130.leetcode.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayQuickSortTest {
    ArrayQuickSort arrayQuickSort = new ArrayQuickSort();
    ArrayHeapSort arrayHeapSort = new ArrayHeapSort();

    @Test
    public void sort() {
        int[] arr = new int[]{49, 38, 65, 97, 23, 22, 76, 1, 5, 8, 2, 0, -1, 22};
        Assert.assertArrayEquals(new int[]{-1, 0, 1, 2, 5, 8, 22, 22, 23, 38, 49, 65, 76, 97}, arrayQuickSort.sort(arr));
    }

    @Test
    public void testHeapSort() {
        int[] arr = new int[]{49, 38, 65, 97, 23, 22, 76, 1, 5, 8, 2, 0, -1, 22};
        Assert.assertArrayEquals(
                new int[]{-1, 0, 1, 2, 5, 8, 22, 22, 23, 38, 49, 65, 76, 97},
                arrayHeapSort.sort(arr)
        );

        int[] case2 = new int[]{49, 38, 65, 97, 23, 22, 76, 1, 5, 8, 2, 0, -1, 22};
        Assert.assertArrayEquals(
                new int[]{7, 6, 7, 11, 5, 12, 3, 0, 1, 13},
                arrayHeapSort.sort(case2)
        );
    }
}