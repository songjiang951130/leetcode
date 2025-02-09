package com.github.songjiang951130;

import com.github.songjiang951130.leetcode.base.TreeNode;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @see
 */
public class TreeBuild {
    public static TreeNode constructTreeFromArray(int[] nums) {
        if (nums.length == 0) return null; // 如果数组为空，则返回null

        TreeNode root = null; // 初始化根节点为null

        for (int num : nums) {
            root = insertIntoBST(root, num); // 插入每个数到BST中
        }

        return root; // 返回构造好的树的根节点
    }

    public static TreeNode insertIntoBST(TreeNode root, int val) {
        // 如果树是空的，则返回新的节点作为根节点
        if (root == null) {
            return new TreeNode(val);
        }
        // 根据当前节点值与插入值比较，决定向左或向右子树递归插入
        if (val < root.val) {
            root.left = insertIntoBST(root.left, val);
        } else {
            root.right = insertIntoBST(root.right, val);
        }
        return root;
    }
}
