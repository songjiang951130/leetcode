package com.github.songjiang951130.leetcode.array;

import com.google.common.collect.Lists;
import junit.framework.TestCase;
import org.junit.Assert;

import java.util.List;

public class TriangleTest extends TestCase {
    Triangle triangle = new Triangle();

    public void testGenerate() {
        List<List<Integer>> generate = triangle.generate(5);
        List<List<Integer>> arrayList = Lists.newArrayList(
                Lists.newArrayList(1),
                Lists.newArrayList(1, 1),
                Lists.newArrayList(1, 2, 1),
                Lists.newArrayList(1, 3, 3, 1),
                Lists.newArrayList(1, 4, 6, 4, 1)
        );
        Assert.assertEquals(arrayList, generate);
    }

    public void testCase1() {
        List<List<Integer>> generate = triangle.generate(1);
        List<Integer> integers = Lists.newArrayList(1);
        Assert.assertEquals(1, generate.size());
        Assert.assertEquals(integers, generate.get(0));
    }
}