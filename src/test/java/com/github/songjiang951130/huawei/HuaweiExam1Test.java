package com.github.songjiang951130.huawei;

import com.google.common.collect.Lists;
import junit.framework.TestCase;

import java.util.List;

public class HuaweiExam1Test extends TestCase {
    HuaweiExam1 exam = new HuaweiExam1();

    public void testCombinationSum() {
        List<List<Integer>> case1 = exam.combinationSum(new int[]{2, 3, 6, 7}, 7);
        assertEquals(case1, Lists.newArrayList(
                Lists.newArrayList(2, 2, 3),
                Lists.newArrayList(7)
        ));

        List<List<Integer>> case2 = exam.combinationSum(new int[]{2, 3, 5}, 8);
        assertEquals(case2, Lists.newArrayList(
                Lists.newArrayList(2, 2, 2, 2),
                Lists.newArrayList(2, 3, 3),
                Lists.newArrayList(3, 5)
        ));
        List<List<Integer>> case3 = exam.combinationSum(new int[]{2}, 1);
        assertEquals(case3.size(), 0);
    }
}