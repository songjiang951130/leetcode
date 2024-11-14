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

    public List<String> generateParenthesis(int n) {
        char[] chars = new char[n * 2];
        List<String> res = new ArrayList<>();
        generate(chars, 0, 2 * n, res);
        return res;
    }

    private void generate(char[] chars, int i, int len, List<String> res) {
        if (i == len) {
            if (validValue(chars)) {
                res.add(new String(chars));
            }
            return;
        }

        chars[i] = '(';
        generate(chars, i + 1, len, res);
        chars[i] = ')';
        generate(chars, i + 1, len, res);
    }

    private boolean validValue(char[] chars) {
        int left = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '(') {
                left++;
            } else if (chars[i] == ')') {
                left--;
            }
            if (left < 0) {
                return false;
            }
        }
        return left == 0;
    }
}
