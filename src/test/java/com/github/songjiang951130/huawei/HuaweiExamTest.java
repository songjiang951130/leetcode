package com.github.songjiang951130.huawei;

import com.google.common.collect.Lists;
import junit.framework.TestCase;

import java.util.List;

public class HuaweiExamTest extends TestCase {

    public void testMinClick() {
        int[][] test1 = {{0, 0}, {0, 0}};
        assertEquals(0, HuaweiExam.minClicks(test1));

        int[][] test2 = {{0, 0}, {0, 1}};
        assertEquals(1, HuaweiExam.minClicks(test2));
        int[][] test3 = {{1, 1}, {1, 1}};
        assertEquals(1, HuaweiExam.minClicks(test3));

        int[][] test4 = {{1, 0, 0}, {0, 1, 0}, {0, 0, 1}};
        assertEquals(1, HuaweiExam.minClicks(test4));

        int[][] test5 = {{1, 0, 1}, {0, 1, 0}, {1, 0, 1}};
        assertEquals(1, HuaweiExam.minClicks(test5));
    }

    public void testGetMaxTasks() {
        List<HuaweiExam.Task> testCase1 = Lists.newArrayList(
                new HuaweiExam.Task(1, 2),
                new HuaweiExam.Task(2, 2),
                new HuaweiExam.Task(3, 4)
        );
        assertEquals(3, HuaweiExam.getMaxTasks(testCase1));
    }
}