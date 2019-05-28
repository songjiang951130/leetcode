package stack;

public class Leetcode1021 {

    /**
     * 移除最外层的 ()
     * 思路 计算 左括号 和 右括号数 相等时，即可去除最外层的括号
     *
     * @link https://leetcode.com/problems/remove-outermost-parentheses
     * @param S
     * @return
     */
    public String removeOuterParentheses(String S) {
        StringBuilder sb = new StringBuilder();
        int left = 0;
        int right = 0;
        char[] chars = S.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (c == '(') {
                left++;
            }
            if (c == ')') {
                right++;
            }

            if (left == right) {
                sb.append(S.substring(i - left * 2 + 2, i));
                left = 0;
                right = 0;
            }
        }

        return sb.toString();
    }
}
