package com.github.songjiang951130.leetcode.backtrack;

import java.util.ArrayList;
import java.util.List;

public class Parenthesi {
    /**
     * 多少种有效括号
     *
     * @param n
     * @return
     */
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        backTrace(new StringBuilder(""), 0, 0, res, n);
        System.out.println(res);
        return res;
    }

    /**
     * @param stringBuilder
     * @param left
     * @param right
     * @param res
     */
    private void backTrace(StringBuilder stringBuilder, int left, int right, List<String> res, int n) {
        if (right + left == n * 2) {
            res.add(stringBuilder.toString());
            return;
        }
        if (left < n) {
            stringBuilder.append('(');
            backTrace(stringBuilder, ++left, right, res, n);
        }
        if (left > right) {
            stringBuilder.append(')');
            backTrace(stringBuilder, left, ++right, res, n);
        }
    }
}
