package com.github.songjiang951130.leetcode.backtrack;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class SubsetTest {

    @Test
    public void subsets() {
        Subset subset = new Subset();
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());
        result.add(Arrays.asList(1));
        result.add(Arrays.asList(1, 2));
        result.add(Arrays.asList(1, 2, 3));
        result.add(Arrays.asList(1, 3));
        result.add(Arrays.asList(2));
        result.add(Arrays.asList(2, 3));
        result.add(Arrays.asList(3));

        Assert.assertEquals(result, subset.subsets(new int[]{1, 2, 3}));
    }

    /**
     * Input: [1,2,2]
     * Output:
     * [
     * [2],
     * [1],
     * [1,2,2],
     * [2,2],
     * [1,2],
     * []
     * ]
     */

    @Test
    public void subsets2Case1() {
        Subset subset = new Subset();

        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());
        result.add(Arrays.asList(1));
        result.add(Arrays.asList(1, 2));
        result.add(Arrays.asList(1, 2, 2));
        result.add(Arrays.asList(2));
        result.add(Arrays.asList(2, 2));

        Assert.assertEquals(result, subset.subsets2(new int[]{1, 2, 2}));
    }

    @Test
    public void subsets2Case2() {
        Subset subset = new Subset();

        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());
        result.add(Arrays.asList(2));
        result.add(Arrays.asList(2, 2));
        result.add(Arrays.asList(2, 2, 2));

        Assert.assertEquals(result, subset.subsets2(new int[]{2, 2, 2}));
    }

    @Test
    public void subsets2Case3() {
        Subset subset = new Subset();

        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());
        result.add(Arrays.asList(1));
        result.add(Arrays.asList(1, 2));
        result.add(Arrays.asList(1, 2, 2));
        result.add(Arrays.asList(2));
        result.add(Arrays.asList(2, 2));

        Assert.assertEquals(result, subset.subsets2(new int[]{2, 1, 2}));
    }
}
