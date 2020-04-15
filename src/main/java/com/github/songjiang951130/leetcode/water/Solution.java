package com.github.songjiang951130.leetcode.water;

public class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {
        int result = 0;
        for (int i = 0; i < dominoes.length; i++) {
            for (int j = i + 1; j < dominoes.length; j++) {
                if (dominoes[i][0] == dominoes[j][0] && dominoes[i][1] == dominoes[j][1]) {
                    result++;
                    continue;
                }
                if (dominoes[i][1] == dominoes[j][0] && dominoes[i][0] == dominoes[j][1]) {
                    result++;
                    continue;
                }
            }
        }
        return result;
    }

    public String longestCommonPrefix(String[] strs) {
        if(strs == null){
            return "";
        }
        if(strs.length == 1){
            return strs[0];
        }
        int index = 0;
        StringBuilder sb = new StringBuilder();
        while(index!=-1){
            char c = strs[0].charAt(index);
            for(int i = 1;i < strs.length && index < strs[i].length();i++){
                if(strs[i].charAt(index) != c){
                    index = -1;
                    break;
                }
                if(i == strs.length){
                    index++;
                }
            }
            sb.append(c);
        }
        return sb.toString();
    }
}
