package com.github.songjiang951130.leetcode.bfs;

import com.github.songjiang951130.leetcode.database.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 二叉树层序遍历
 *
 * @link <link>https://leetcode-cn.com/problems/binary-tree-level-order-traversal/</link>
 */
public class TreeLevel {

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        //创建一个队列，用于存储当前节点的所有相邻节点
        Queue<TreeNode> queue = new LinkedList();
        queue.add(root);
        while (!queue.isEmpty()) {
            //get current level size
            int size = queue.size();
            List<Integer> list = new ArrayList<>(size);
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                list.add(node.val);
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
            result.add(list);
        }

        return result;
    }
}
