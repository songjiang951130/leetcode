package com.github.songjiang951130.leetcode.backtrack;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class LetterCaseTest {

    @Test
    public void letterCasePermutation() {
        List<String> list1 = new ArrayList<>();
        list1.add("a1r2");
        list1.add("a1R2");
        list1.add("A1r2");
        list1.add("A1R2");
        LetterCase letterCase = new LetterCase();
        Assert.assertEquals(list1,letterCase.letterCasePermutation("a1r2"));
        List<String> list2 = new ArrayList<>();
        list2.add("3z4");
        list2.add("3Z4");
        Assert.assertEquals(list2,letterCase.letterCasePermutation("3z4"));

        List<String> list3 = new ArrayList<>();
        list3.add("12345");
        Assert.assertEquals(list3,letterCase.letterCasePermutation("12345"));
    }
}
