package com.github.songjiang951130.leetcode.water;

import com.github.songjiang951130.leetcode.base.TreeNode;

public class Tree {

    public int rangeSumBST(TreeNode root, int L, int R) {
        if (root == null) {
            return 0;
        }
        int sum = 0;
        if (root.val >= L && root.val <= R) {
            sum += root.val;
        }
        sum += rangeSumBST(root.right, L, R)+rangeSumBST(root.left, L, R);
        return sum;
    }
}
