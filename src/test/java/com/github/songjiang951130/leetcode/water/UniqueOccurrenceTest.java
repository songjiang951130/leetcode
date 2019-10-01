package com.github.songjiang951130.leetcode.water;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * https://leetcode-cn.com/contest/weekly-contest-156/problems/unique-number-of-occurrences/
 */
public class UniqueOccurrenceTest {
    UniqueOccurrence uniqueOccurrence = new UniqueOccurrence();

    @Test
    public void uniqueOccurrences() {
        int[] case1 = {1,5};
        assertFalse(uniqueOccurrence.uniqueOccurrences(case1));
        int[] case2 = {1,2,2,1,1,3};
        assertTrue(uniqueOccurrence.uniqueOccurrences(case2));
        int[] case3 = {-3,0,1,-3,1,1,1,-3,10,0};
        assertTrue(uniqueOccurrence.uniqueOccurrences(case3));
    }
}