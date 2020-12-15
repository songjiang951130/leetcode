package com.github.songjiang951130.leetcode.backtrack;

import com.google.common.collect.Lists;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertTrue;

public class MoneyTest {
    Money money = new Money();

    @Test
    public void handle() {
        List<List<Integer>> result = money.handle(new int[]{10, 10, 20, 40, 60, 120}, 100);
        List<Integer> list = Lists.newArrayList(10, 10, 20, 60);
        List<List<Integer>> expect1 = new ArrayList<>();
        expect1.add(list);
        assertTrue(expect1.equals(result));
    }
}