package com.github.songjiang951130.leetcode.string;

public class Test {

    /**
     * 例如：str="aaabbcdeaa"，返回"abcdea"
     *
     * @param string
     * @return
     */
    public String deleteStr(String string) {
        if (string == null || string.length() == 1) {
            return string;
        }
        char[] chars = string.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(chars[0]);
        char now = chars[0];
        for (int i = 1; i < chars.length; i++) {
            char c = chars[i];
            if (now != c) {
                stringBuilder.append(c);
                now = c;
            }
        }
        return stringBuilder.toString();
    }
}