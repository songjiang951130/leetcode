package com.github.songjiang951130.leetcode.math;

class Solution {
    /**
     * case  123 * 456
     * 3*456  =   8
     *
     * @param num1
     * @param num2
     * @return
     */
    public String multiply(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0")) {
            return "0";
        }
        int n1 = num1.length() - 1;
        int n2 = num2.length() - 1;
        //加2 考虑了乘的进一位
        int[] array = new int[n1 + n2 + 2];
        for (int i = n1; i >= 0; i--) {
            for (int j = n2; j >= 0; j--) {
                int v = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                //处理进位问题 和原有数据相加
                v += array[i + j + 1];
                array[i + j] += v / 10;
                array[i + j + 1] = v % 10;
                //System.out.println(Arrays.toString(array));
            }
        }

        //过滤左侧0
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            if (i == 0 && array[i] == 0) {
                continue;
            }
            sb.append(array[i]);
        }
        return sb.toString();
    }
}