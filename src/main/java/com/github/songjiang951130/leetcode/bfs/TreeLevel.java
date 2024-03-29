package com.github.songjiang951130.leetcode.bfs;

import com.github.songjiang951130.leetcode.base.TreeNode;

import java.util.*;

/**
 * 二叉树层序遍历
 *
 * @link <a href="https://leetcode-cn.com/problems/binary-tree-level-order-traversal">link</a>
 */
public class TreeLevel {

    /**
     * 二叉树层序遍历
     * @param root 头结点
     * @return 层序遍历结果
     */
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        // 创建一个队列，用于存储当前节点的所有相邻节点
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            // get current level size
            int size = queue.size();
            List<Integer> list = new ArrayList<>(size);
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                assert node != null;
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

    /**
     * 二叉树的锯齿形层序遍历
     * @param root 头结点
     * @return 层序遍历结果
     */
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        // 创建一个队列，用于存储当前节点的所有相邻节点
        Deque<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int index = 0;
        while (!queue.isEmpty()) {
            // get current level size
            int size = queue.size();
            List<Integer> list = new ArrayList<>(size);
            for (int i = 0; i < size; i++) {
                if (index % 2 == 0) {
                    TreeNode node = queue.pop();
                    list.add(node.val);
                    if (node.left != null) {
                        queue.offer(node.left);
                    }
                    if (node.right != null) {
                        queue.offer(node.right);
                    }
                } else {
                    TreeNode node = queue.pollLast();
                    assert node != null;
                    list.add(node.val);
                    if (node.right != null) {
                        queue.offer(node.right);
                    }
                    if (node.left != null) {
                        queue.offer(node.left);
                    }
                }
            }
            result.add(list);
            index++;
        }
        return result;
    }
}
