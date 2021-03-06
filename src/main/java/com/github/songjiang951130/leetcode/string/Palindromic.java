package com.github.songjiang951130.leetcode.string;

public class Palindromic {

    public boolean isPalindromic(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    /**
     *
     * 回文数字
     *
     * @link https://leetcode-cn.com/problems/palindrome-number
     * @param num
     * @return
     */
    public boolean isPalindrome(int num) {
        if (num < 0) {
            return false;
        }
        int reverseNum = 0;

        while (num > reverseNum) {
            reverseNum = reverseNum * 10 + num % 10;
            num /= 10;
        }
        return reverseNum == num || reverseNum / 10 == num;
    }
}
