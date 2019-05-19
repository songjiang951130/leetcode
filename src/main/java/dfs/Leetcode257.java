package dfs;

import java.util.ArrayList;
import java.util.List;

import database.TreeNode;

/**
 * @link https://leetcode.com/problems/binary-tree-paths
 */
public class Leetcode257 {

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list = new ArrayList<String>();
        path(list, "", root);
        return list;
    }

    public List<String> path(List<String> list, String result, TreeNode root) {
        if(root == null){
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
        path(list, result, root.right);
        path(list, result, root.left);
        return list;
    }