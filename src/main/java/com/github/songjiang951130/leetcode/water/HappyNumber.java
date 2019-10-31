package com.github.songjiang951130.leetcode.water;

/**
 * leetcode 202
 */
public class HappyNumber {
    /**
     * @param n
     * @return boolean
     * @link https://leetcode-cn.com/problems/happy-number/comments/
     * 思路/总结: 快慢指针解决循环问题
     * <p>
     * 额外：
     * 不是快乐数的数称为不快乐数（unhappy number），所有不快乐数的数位平方和计算，最後都会进入
     * 4 → 16 → 37 → 58 → 89 → 145 → 42 → 20 → 4 的循环中
     */
    public boolean isHappy(int n) {
        int slow = n, fast = n;
        do {
            slow = twoPoint(slow);
            fast = twoPoint(fast);
            fast = twoPoint(fast);
        } while (fast != slow);
        return fast == 1;
    }

    private int twoPoint(int n) {
        int num = 0;
        while (n > 0) {
            num += Math.pow(n % 10, 2);
            n /= 10;
        }
        return num;
    }
}
