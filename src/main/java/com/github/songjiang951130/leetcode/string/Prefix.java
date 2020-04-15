package com.github.songjiang951130.leetcode.string;

public class Prefix {
    /**
     * @param strs
     * @return
     * @link https://leetcode-cn.com/problems/longest-common-prefix/
     */
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        for (int i = 0; i < strs[0].length(); i++) {
            char c = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                /**
                 * strs[0].length > strs[j].length || 字符不相等
                 */
                if (i == strs[j].length() || c != strs[j].charAt(i)) {
                    return strs[0].substring(0, i);
                }
            }
        }
        return strs[0];
    }


}
