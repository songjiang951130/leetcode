package com.github.songjiang951130.leetcode.water;//给定一个二叉树，返回所有从根节点到叶子节点的路径。
//
// 说明: 叶子节点是指没有子节点的节点。 
//
// 示例: 
//
// 输入:
//
//   1
// /   \
//2     3
// \
//  5
//
//输出: ["1->2->5", "1->3"]
//
//解释: 所有根节点到叶子节点的路径为: 1->2->5, 1->3 
// Related Topics 树 深度优先搜索 
// 👍 344 👎 0


import com.github.songjiang951130.leetcode.database.TreeNode;

import java.util.LinkedList;
import java.util.List;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode(int x) { val = x; }
 * }
 */
public class Leetcode257 {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new LinkedList<>();
        if (root == null) {
            return result;
        }
        path(root, result, "");
        return result;
    }

    private void path(TreeNode root, List<String> result, String path) {
        if (root == null) {
            return;
        }
        if (root.left == null && root.right == null) {
            path +=root.val;
            result.add(path);
            return;
        }
        path = path +root.val +"->";
        path(root.right, result, path);
        path(root.left, result, path);
    }
}
