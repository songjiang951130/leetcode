package com.github.songjiang951130.leetcode.string;

public class Transform {
    public int toInt(String str) {
        if (str == null) {
            throw new NullPointerException("str is null");
        }
        if (str.length() == 0) {
//            throw new IllegalArgumentException("str length is 0");
            return 0;
        }
        str = str.trim();
        char[] chars = str.toCharArray();
        long sum = 0;
        boolean isNegative = false;
        int charCount = 0;
        for (int i = 0; i < chars.length; i++) {
            //fix +-2 return 0
            if (charCount > 1) {
                return 0;
            }
            char c = chars[i];
            //fix 00021 return 21
            if (sum == 0 && c == '0') {
                continue;
            }
            if (isNumber(c)) {
                sum = sum * 10 + (c - 48);
                if (sum > Integer.MAX_VALUE) {
                    return isNegative ? Integer.MIN_VALUE : Integer.MAX_VALUE;
                }
            } else if (c == '-' && i == 0) {
                isNegative = true;
                charCount++;
            } else if (c == '+' && i == 0) {
                charCount++;
                continue;
            } else {
                break;
            }
        }
        return (int) (isNegative ? -sum : sum);
    }

    public static boolean isNumber(char c) {
        if (c <= '9' && c >= '0') {
            return true;
        }
        return false;
    }
}
