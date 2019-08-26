package com.github.songjiang951130.leetcode.backtrack;

import java.util.ArrayList;
import java.util.List;

/**
 * question_id 784
 */
public class LetterCase {
    public List<String> letterCasePermutation(String S) {
        List<String> result = new ArrayList<>();
        backTrack(S, 0, "", result);
        return result;
    }

    private void backTrack(String string, int index, String result, List<String> resultList) {
        if (index == string.length()) {
            resultList.add(result);
            return;
        }
        // a - A = 32
        char c = string.charAt(index);
        if (c <= 'z' && c >= 'a') {
            backTrack(string,index+1,result+c,resultList);
            backTrack(string,index+1,result+(char)(c-32),resultList);
        } else if (c <= 'Z' && c >= 'A') {
            backTrack(string,index+1,result+c,resultList);
            backTrack(string,index+1,result+(char)(c+32),resultList);
        }else if (c <= '9' && c >= '0'){
            backTrack(string,index+1,result+c,resultList);
        }

    }

}
