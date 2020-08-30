package com.github.songjiang951130.leetcode.tree;

import com.github.songjiang951130.leetcode.database.TreeNode;

/**
 * 剑指 Offer 26. 树的子结构
 * 
 * @link https://leetcode-cn.com/problems/shu-de-zi-jie-gou-lcof/
 */
public class Child {
    /**
     * error case:[4,2,3,4,5,6,7,8,9] [4,8,9]
     * 
     * @param A
     * @param B
     * @return
     */
    public boolean isSubStructure(TreeNode A, TreeNode B) {
        if (B == null) {
            return false;
        }
        return helper(A, B) || helper(A.left, B) || helper(A.right, B);
    }

    public boolean helper(TreeNode A, TreeNode B) {
        if (B == null) {
            return true;
        }
        if (A == null) {
            return false;
        }
        return A.val == B.val ? helper(A.left, B.left) && helper(A.right, B.right) : false;
    }
}