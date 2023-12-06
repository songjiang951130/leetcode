package com.github.songjiang951130.leetcode.backtrack;

import com.google.common.collect.Lists;
import junit.framework.TestCase;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class LetterCombinationTest extends TestCase {
    LetterCombination letterCombination = new LetterCombination();

    public void testLetterCombinations() {
        List<String> strings = letterCombination.letterCombinations("23");
        assertEquals(9, strings.size());
        assertEquals(Lists.newArrayList("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"), strings);
    }
}