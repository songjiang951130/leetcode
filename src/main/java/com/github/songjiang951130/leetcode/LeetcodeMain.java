package com.github.songjiang951130.leetcode;

public class LeetcodeMain {
    public static void main(String[] args) {
        LeetcodeMain solution = new LeetcodeMain();
        String s = solution.longestCommonPrefix(new String[]{"ab", "a"});
        System.out.println(s);
        //

        s = solution.longestCommonPrefix(new String[]{"flower","flow","flight"});
        System.out.println(s);

        s = solution.longestCommonPrefix(new String[]{"flower","flower","flower"});
        System.out.println(s);

        int idx = solution.strStr("aaa", "aaa");
        System.out.println(idx);
    }

    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 1) {
            return strs[0];
        }
        int idx = 0;
        int len = strs[0].length();
        while (idx < len){
            for (int i = 1; i < strs.length; i++) {
                if (idx >= strs[i].length() || idx >= strs[i - 1].length()) {
                    return strs[0].substring(0, idx);
                }

                if (strs[i].charAt(idx) != strs[i - 1].charAt(idx)) {
                    return strs[0].substring(0, idx);
                }
            }
            idx++;
        }
        return strs[strs.length - 1].substring(0, idx );
    }



    public int strStr(String haystack, String needle) {
        char[] h = haystack.toCharArray();
        char[] n = needle.toCharArray();
        for (int i = 0; i <= h.length - n.length; i++) {
            int s = i;
            int ni = 0;
            while (h[s] == n[ni]) {
                s++;
                ni++;
                if (ni == n.length) {
                    return i;
                }
            }
        }
        return -1;
    }
}
