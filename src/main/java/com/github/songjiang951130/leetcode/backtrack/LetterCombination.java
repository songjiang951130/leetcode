package com.github.songjiang951130.leetcode.backtrack;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterCombination {

    public static Map<Character, String> map = new HashMap<>();

    static {
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");
    }

    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();
        if (digits == null || digits.length() == 0) {
            return res;
        }
        dfs(digits, 0, res, "");
        return res;
    }

    private void dfs(String digits, int i, List<String> res, String tempResult) {
        if (i == digits.length()) {
            res.add(tempResult);
            return;
        }
        String s = map.get(digits.charAt(i));
        for (char c : s.toCharArray()) {
            dfs(digits, i + 1, res, tempResult + c);
        }
    }
}
