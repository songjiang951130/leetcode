package com.github.songjiang951130.hw;

import com.github.songjiang951130.leetcode.base.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class HuaweiTest {

    public int nodeNum(TreeNode head) {
        // write code here
        Queue<TreeNode> list = new LinkedList<>();
        list.add(head);
        int res = 0;
        while (!list.isEmpty()) {
            TreeNode node = list.poll();
            res++;
            if (node.left != null) {
                list.add(node.left);
            }
            if (node.right != null) {
                list.add(node.right);
            }
        }
        return res;
    }

    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * @param root TreeNode类 the root of binary tree
     * @return int整型二维数组
     */
    public int[][] threeOrders(TreeNode root) {
        // write code here
        List<Integer> printFist = new ArrayList<>();
        printFirst(root, printFist);
        int size = printFist.size();
        int[][] res = new int[3][size];
        for (int i = 0; i < size; i++) {
            res[0][i] = printFist.get(i);
        }
        printFist = new ArrayList<>();
        printMid(root, printFist);
        for (int i = 0; i < size; i++) {
            res[1][i] = printFist.get(i);
        }


        printFist = new ArrayList<>();
        printLast(root, printFist);
        for (int i = 0; i < size; i++) {
            res[2][i] = printFist.get(i);
        }
        return res;
    }

    void printFirst(TreeNode root, List<Integer> res) {
        if (root == null) {
            return;
        }
        res.add(root.val);
        printFirst(root.left, res);
        printFirst(root.right, res);
    }

    void printMid(TreeNode root, List<Integer> res) {
        if (root == null) {
            return;
        }
        printFirst(root.left, res);
        res.add(root.val);
        printFirst(root.right, res);
    }

    void printLast(TreeNode root, List<Integer> res) {
        if (root == null) {
            return;
        }
        printFirst(root.left, res);
        printFirst(root.right, res);
        res.add(root.val);

    }
}
