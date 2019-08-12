package com.github.songjiang951130.leetcode.dfs;

import com.github.songjiang951130.leetcode.database.TreeNode;

public class OrderSearchTree {

    /**
     * 已知二叉搜索树的根节点，现在已最左边的值为新的根节点，将他转化为
     *
     * @param root
     * @return
     */
    public TreeNode increasingBST(TreeNode root) {
        return dps(root, null);
    }

    private TreeNode dps(TreeNode root, TreeNode tail) {
        if (root == null) {
            return tail;
        }
        //先吧左边的加入尾部，再把左子树置为空
        TreeNode result = dps(root.left, root);
        root.left = null;
        root.right = dps(root.right, tail);
        return result;
    }
}
