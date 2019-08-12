package com.github.songjiang951130.leetcode.dfs;

import java.util.ArrayList;
import java.util.List;

import com.github.songjiang951130.leetcode.database.TreeNode;

/**
 * @link https://leetcode.com/problems/binary-tree-paths
 */
public class Leetcode257 {

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list = new ArrayList<String>();
        path(list, "", root);
        return list;
    }

    private List<String> path(List<String> list, String result, TreeNode root) {
        if (root == null) {
            return null;
        }
        result += "->" + root.val;
        if (root.left == null && root.right == null) {
            result = result.substring(2);
            if (!result.equals("")) {
                list.add(result);
            }
            return list;
        }
        path(list, result, root.left);
        path(list, result, root.right);
        return list;
    }
}