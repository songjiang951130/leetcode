package com.github.songjiang951130.leetcode.backtrack;

import com.github.songjiang951130.leetcode.backtrack.Leetcode17;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class Leetcode17Test {
    Leetcode17 leetcode;

    @Test
    public void letterCombinations() {
        leetcode = new Leetcode17();

        assertEquals(new ArrayList<String>(), leetcode.letterCombinations(""));
        List<String> list = new ArrayList<>();
        String[] array = {
                "ad", "ae", "af",
                "bd", "be", "bf",
                "cd", "ce", "cf",
        };
        Collections.addAll(list, array);

        assertEquals(list, leetcode.letterCombinations("23"));

    }

    //letterCombinations2

    @Test
    public void letterCombinationsTest() {
        leetcode = new Leetcode17();

        assertEquals(new ArrayList<String>(), leetcode.letterCombinations2(""));
        List<String> list = new ArrayList<>();
        String[] array = {
                "ad", "ae", "af",
                "bd", "be", "bf",
                "cd", "ce", "cf",
        };
        Collections.addAll(list, array);

        assertEquals(list, leetcode.letterCombinations2("23"));

    }
}