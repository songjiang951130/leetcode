package com.github.songjiang951130.leetcode.dfs;

import com.github.songjiang951130.ioc.core.utils.Assert;
import com.google.common.collect.Lists;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class CombineTest {
    Combine combine = new Combine();

    @Test
    public void combine() {
        List<List<Integer>> res1 = combine.combine(3, 2);
        List<List<Integer>> except1 = new ArrayList<>();
        except1.add(Lists.newArrayList(1, 2));
        except1.add(Lists.newArrayList(1, 3));
        except1.add(Lists.newArrayList(2, 3));
        assertEquals(except1, res1);
    }

    @Test
    public void combineException() {
        assertTrue(combine.combine(0, 0).isEmpty());
        assertTrue(combine.combine(1, 0).isEmpty());
        assertTrue(combine.combine(4, 5).isEmpty());
    }
}