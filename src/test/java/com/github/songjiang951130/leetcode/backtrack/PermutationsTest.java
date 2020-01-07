package com.github.songjiang951130.leetcode.backtrack;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PermutationsTest {

    @Test
    public void permute() {
        Permutations permutation = new Permutations();
        List<List<Integer>> result = new ArrayList<>();
        // result.add(new ArrayList<>());
        result.add(Arrays.asList(1, 2, 3));
        result.add(Arrays.asList(1, 3, 2));
        result.add(Arrays.asList(2, 1, 3));
        result.add(Arrays.asList(2, 3, 1));
        result.add(Arrays.asList(3, 1, 2));
        result.add(Arrays.asList(3, 2, 1));
        Assert.assertEquals(result, permutation.permute(new int[] { 1, 2, 3 }));
    }

    @Test
    public void permute2() {
        Permutations permutation = new Permutations();
        List<List<Integer>> result = new ArrayList<>();
        result.add(Arrays.asList(1, 1, 2));
        result.add(Arrays.asList(1, 2, 1));
        result.add(Arrays.asList(2, 1, 1));
        Assert.assertEquals(result, permutation.permute2(new int[] { 1, 1, 2 }));
    }

    @Test
    public void permute2Case2() {
        Permutations permutation = new Permutations();
        List<List<Integer>> result = new ArrayList<>();
        result.add(Arrays.asList(0, 3, 3, 3));
        result.add(Arrays.asList(3, 0, 3, 3));
        result.add(Arrays.asList(3, 3, 0, 3));
        result.add(Arrays.asList(3, 3, 3, 0));
        Assert.assertEquals(result, permutation.permute2(new int[] { 3, 0, 3, 3 }));
    }
}