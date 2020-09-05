package com.github.songjiang951130.leetcode.week1;

import com.github.songjiang951130.leetcode.base.TreeNode;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Solution {
    public String reformat(String s) {
        LinkedList<Character> characters = new LinkedList<>();
        LinkedList<Character> numbers = new LinkedList<>();
        for (char ch : s.toCharArray()) {
            if (ch >= '0' && ch <= '9') {
                numbers.add(ch);
            }
            if (ch >= 'a' && ch <= 'z') {
                characters.add(ch);
            }
        }

        if (Math.abs(characters.size() - numbers.size()) > 1) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        boolean first = characters.size() > numbers.size();
        while (!characters.isEmpty() && !numbers.isEmpty()) {
            if (first) {
                sb.append(characters.poll());
            } else {
                sb.append(numbers.poll());
            }
            first = !first;
        }
        if (!characters.isEmpty()) {
            sb.append(characters.poll());
        }
        if (!numbers.isEmpty()) {
            sb.append(numbers.poll());
        }
        return sb.toString();

    }

    /**
     * 二叉树层序遍历倒着打印
     * @todo 方便的树构建方式
     * @param root
     * @return
     */
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        LinkedList<List<Integer>> res = new LinkedList<>();
        if (root == null) {
            return res;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> temp = new LinkedList<>();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                temp.add(node.val);
                if(node.left != null){
                    queue.add(node.left);
                }
                if(node.right != null) {
                    queue.add(node.right);
                }
                if (i == size - 1) {
                    res.addFirst(temp);
                }
            }
        }
        return res;
    }

    /**
     * java.lang.NullPointerException
     *   at line 23, Solution.levelOrderBottom
     *   at line 57, __DriverSolution__.__helper__
     *   at line 85, __Driver__.main
     */
}