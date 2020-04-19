package com.github.songjiang951130.leetcode.week1;

import java.util.LinkedList;

class Solution {
    public String reformat(String s) {
        LinkedList<Character> characters = new LinkedList<>();
        LinkedList<Character> numbers = new LinkedList<>();
        for (char ch : s.toCharArray()) {
            if (ch >= '0' && ch <= '9') {
                numbers.add(ch);
            }
            if (ch >= 'a' && ch <= 'z') {
                characters.add(ch);
            }
        }

        if (Math.abs(characters.size() - numbers.size()) > 1) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        boolean first = characters.size() > numbers.size();
        while (!characters.isEmpty() && !numbers.isEmpty()) {
            if (first) {
                sb.append(characters.poll());
            } else {
                sb.append(numbers.poll());
            }
            first = !first;
        }
        if (!characters.isEmpty()) {
            sb.append(characters.poll());
        }
        if (!numbers.isEmpty()) {
            sb.append(numbers.poll());
        }
        return sb.toString();

    }


//    public String reformat(String s) {
//        if (!check(s)) {
//            return "";
//        }
//        StringBuilder stringBuilder = new StringBuilder();
//        int n = 0;
//        int c = 0;
//        while (n < s.length() && c < s.length()) {
//            while (n < s.length() && s.charAt(n) >= 'a' && s.charAt(n) <= 'z') {
//                n++;
//            }
//            stringBuilder.append(s.charAt(n));
//            n++;
//            if (c < s.length() && s.charAt(c) >= '0' && s.charAt(c) <= '9') {
//                c++;
//            }
//            stringBuilder.append(s.charAt(c));
//            c++;
//        }
//        return stringBuilder.toString();
//
//    }

    private boolean check(String s) {
        int n = 0;
        int c = 0;
        for (char ch : s.toCharArray()) {
            if (ch >= '0' && ch <= '9') {
                n++;
            }
            if (ch >= 'a' && ch <= 'z') {
                c++;
            }
        }
        return Math.abs(c - n) == 1;
    }
}