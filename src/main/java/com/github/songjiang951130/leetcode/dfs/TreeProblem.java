package com.github.songjiang951130.leetcode.dfs;

import com.github.songjiang951130.leetcode.base.TreeNode;

public class TreeProblem {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = maxDepth(root.left) + 1;
        int right = maxDepth(root.right) + 1;
        return Math.max(left, right);
    }
}
