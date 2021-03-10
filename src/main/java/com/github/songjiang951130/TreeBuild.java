package com.github.songjiang951130;

import com.github.songjiang951130.leetcode.base.TreeNode;

public class TreeBuild {
    public TreeNode build(int[] preorder, int[] inorder) {
        return null;
//        return help(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1);
    }

    private TreeNode help(int[] preorder, int pStart, int pEnd, int[] inorder, int iStart, int iEnd) {
        if (pStart > pEnd || iStart > iEnd) {
            return null;
        }
        //前序就是相对的根节点
        int i = iStart;
        while (inorder[i] != preorder[pStart]) {
            i++;
        }
        TreeNode root = new TreeNode(preorder[pStart]);
        root.left = help(preorder, pStart + 1, pStart + i - iStart, inorder, iStart, i - 1);
        root.right = help(preorder, pStart + i - iStart, pEnd, inorder, i + 1, iEnd);
        return root;
    }

}
