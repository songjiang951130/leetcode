package com.github.songjiang951130.leetcode.string;

public class Prefix {
    /**
     * @param strs
     * @return
     * @link https://leetcode-cn.com/problems/longest-common-prefix/
     */
    public String longestCommonPrefix(String[] strs) {
        if (strs == null) {
            return "";
        }
        if (strs.length == 1) {
            return strs[0];
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            char c = 0;
            for (int j = 0; j < strs.length; j++) {
                if (i >= strs[j].length()) {
                    i = Integer.MAX_VALUE - 1;
                    break;
                }
                if (j == 0) {
                    c = strs[j].charAt(i);
                    continue;
                }
                if (c != strs[j].charAt(i)) {
                    i = Integer.MAX_VALUE - 1;
                    break;
                }

                if (c == strs[j].charAt(i) && j == strs.length - 1) {
                    stringBuilder.append(c);
                }
            }
        }
        return stringBuilder.toString();
    }
}
