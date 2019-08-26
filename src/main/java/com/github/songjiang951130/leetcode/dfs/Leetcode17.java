package com.github.songjiang951130.leetcode.dfs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Leetcode17 {
    public static Map<Integer, String> map = new HashMap<>();

    static {
        map.put(2, "abc");
        map.put(3, "def");
        map.put(4, "ghi");
        map.put(5, "jkl");
        map.put(6, "mno");
        map.put(7, "qprs");
        map.put(8, "tuv");
        map.put(9, "wxyz");
    }

    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if (digits.equals("")) {
            return result;
        }
        helper(result, "", digits, 0);
        return result;
    }

    public void helper(List<String> resultList, String result, String digits, int index) {
        if (index == digits.length()) {
            resultList.add(result);
            return;
        }
        int key = Integer.parseInt(digits.charAt(index) + "");
        for (char c : map.get(key).toCharArray()) {
            result += c;
            helper(resultList, result, digits, index + 1);
            result = result.substring(0, index);
        }

    }
}