package com.github.songjiang951130.leetcode.stack;

import java.util.ArrayList;
import java.util.List;

public class Parentheses {
    /**
     * https://leetcode.com/problems/generate-parentheses/
     */
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        backTrace(list, "", n, 0, 0);
        return list;
    }

    /**
     * 存在一个问题，就是我当前应该加 左括号还是右括号.
     * 可以这样思考，先加
     *
     * @param list
     * @param length
     */
    private void backTrace(List<String> list, String val, int n, int left, int right) {
        if (val.length() == n * 2) {
            list.add(val);
        }
        if (left < n) {
            backTrace(list, val + "(", n, left + 1, right);
        }
        if (right < left) {
            backTrace(list, val + ")", n, left, right + 1);
        }
    }
}
