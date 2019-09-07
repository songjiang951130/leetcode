package com.github.songjiang951130.leetcode.backtrack;

public class WildcardMatching {

    public boolean isMatch(String s, String p) {
        return backTrace(s, p, 0, 0, false);
    }

    public boolean backTrace(String s, String p, int sIndex, int pIndex, boolean result) {
        if (sIndex == s.length()) {
            return pIndex == p.length();
        }
//        case: "adceb", "*a*b"
        //"abefcdgiescd(12)fimde", "ab*cd?i*(9)de"

        for (int i = pIndex; i < p.length(); i++) {
            if ('*' == p.charAt(i)) {
                if (i == p.length() - 1) {
                    return true;
                }
                //end 处限制了不是最后一个
                if (s.charAt(sIndex) == p.charAt(i + 1)) {
                    if (i == p.length() - 2) {
                        return true;
                    } else if (i < p.length() - 2) {
                        return backTrace(s, p, sIndex + 1, pIndex + 2, result);
                    }
                } else {
                    return backTrace(s, p, sIndex + 1, pIndex, result);
                }
            }

            if ('?' == p.charAt(i)) {
                if (i == p.length() - 1) {
                    return true;
                }
                return backTrace(s, p, sIndex + 1, pIndex + 1, result);
            }
            System.out.printf("sIndex :%d  i:%d \n", sIndex, i);
            if (p.charAt(pIndex) != s.charAt(sIndex)) {
                return false;
            } else {
                return backTrace(s, p, sIndex + 1, pIndex + 1, true);
            }
        }
        if (pIndex > p.length()-1) {
            return false;
        }
        return p.charAt(pIndex) == s.charAt(sIndex);
    }
}
