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
}