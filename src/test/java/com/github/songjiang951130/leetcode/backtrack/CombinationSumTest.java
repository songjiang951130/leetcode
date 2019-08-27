package com.github.songjiang951130.leetcode.backtrack;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class CombinationSumTest {

    @Test
    public void combinationSum() {
        CombinationSum combinationSum = new CombinationSum();

        Integer[] value1 = {2, 2, 3};
        List<Integer> list1 = Arrays.asList(value1);
        Integer[] value2 = {7};
        List<Integer> list2 = Arrays.asList(value2);
        List<List<Integer>> case1 = new ArrayList<>();
        case1.add(list1);
        case1.add(list2);

        Assert.assertEquals(case1, combinationSum.combinationSum(new int[]{2, 3, 6, 7}, 7));
    }

    @Test
    public void combinationSum2Case1() {
        CombinationSum combinationSum = new CombinationSum();

        List<List<Integer>> case1 = new ArrayList<>();
        case1.add(Arrays.asList(1, 1, 6));
        case1.add(Arrays.asList(1, 2, 5));
        case1.add(Arrays.asList(1, 7));
        case1.add(Arrays.asList(2, 6));

        Assert.assertEquals(case1, combinationSum.combinationSum2(new int[]{10, 1, 2, 7, 6, 1, 5}, 8));
    }
}