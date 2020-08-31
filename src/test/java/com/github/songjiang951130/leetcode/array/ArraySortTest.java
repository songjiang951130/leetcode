package com.github.songjiang951130.leetcode.array;

import org.junit.Assert;
import org.junit.Test;

public class ArraySortTest {
    ArraySort arraySort = new ArraySort();
    ArraySortCopy arraySortCopy = new ArraySortCopy();

    @Test
    public void sort() {
        int[] arr = new int[] { 49, 38, 65, 97, 23, 22, 76, 1, 5, 8, 2, 0, -1, 22 };
        Assert.assertArrayEquals(new int[] { -1, 0, 1, 2, 5, 8, 22, 22, 23, 38, 49, 65, 76, 97 }, arraySort.sort(arr));
    }

    @Test
    public void testArraySortCopy() {
        int[] arr = new int[] { 49, 38, 65, 97, 23, 22, 76, 1, 5, 8, 2, 0, -1, 22 };
        Assert.assertArrayEquals(new int[] { -1, 0, 1, 2, 5, 8, 22, 22, 23, 38, 49, 65, 76, 97 },
                arraySortCopy.sort(arr));
    }
}