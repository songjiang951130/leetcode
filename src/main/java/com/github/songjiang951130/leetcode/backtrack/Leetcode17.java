package com.github.songjiang951130.leetcode.backtrack;

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
        List<String> resultList = new ArrayList<>();
        if (digits.equals("")) {
            return resultList;
        }
        helper(resultList, "", digits, 0);
        return resultList;
    }

    private void helper(List<String> resultList, String result, String digits, int index) {
        if (index == digits.length()) {
            resultList.add(result);
            return;
        }
        int key = Integer.parseInt(digits.charAt(index) + "");
        for (char c : map.get(key).toCharArray()) {
            result += c;
            helper(resultList, result, digits, index + 1);
            //除去已加c
            result = result.substring(0, index);
        }

    }


    public List<String> letterCombinations2(String digits) {
        List<String> resultList = new ArrayList<>();
        if (digits.equals("")) {
            return resultList;
        }
        getIndexValue(digits, 0, "", resultList);
        return resultList;
    }

    /**
     * index 获取第几个 对应的字符串
     *
     * @param digits
     * @param index
     * @param result
     */
    private void getIndexValue(String digits, int index, String result, List<String> resultList) {
        if (index == digits.length()) {
            resultList.add(result);
            return;
        }
        int key = Integer.parseInt(digits.charAt(index) + "");
        char[] array = map.get(key).toCharArray();
        for (int i = 0; i < array.length; i++) {
            String temp = result;
            result += array[i];
            getIndexValue(digits, index + 1, result, resultList);
            result = temp;
        }
    }
}