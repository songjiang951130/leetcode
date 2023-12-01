package com.github.songjiang951130.leetcode.bfs;

import com.github.songjiang951130.leetcode.base.TreeNode;
import junit.framework.TestCase;
import org.junit.Assert;

import java.util.List;

public class TreeLevelTest extends TestCase {
    private TreeLevel treeLevel = new TreeLevel();

    /**
     * 二叉树层序遍历
     */
    public void testLevelOrder() {
        TreeNode root = new TreeNode(3);
        List<List<Integer>> lists = treeLevel.levelOrder(root);
        Assert.assertEquals(1, lists.size());
        Assert.assertEquals(1, lists.get(0).size());
        Assert.assertEquals(Integer.valueOf(3), lists.get(0).get(0));

        root.left = new TreeNode(9);
        root.right = new TreeNode(4);
        lists = treeLevel.levelOrder(root);

        Assert.assertEquals(2, lists.size());
        Assert.assertEquals(1, lists.get(0).size());
        Assert.assertEquals(Integer.valueOf(3), lists.get(0).get(0));
        Assert.assertEquals(2, lists.get(1).size());
        Assert.assertEquals(Integer.valueOf(9), lists.get(1).get(0));
        Assert.assertEquals(Integer.valueOf(4), lists.get(1).get(1));

        List<List<Integer>> empty = treeLevel.levelOrder(null);
        assertNotNull(empty);
        assertEquals(0, empty.size());

    }

    public void testZigzagLevelOrder() {

        TreeNode root = new TreeNode(3);
        List<List<Integer>> lists = treeLevel.zigzagLevelOrder(root);
        Assert.assertEquals(1, lists.size());
        Assert.assertEquals(1, lists.get(0).size());
        Assert.assertEquals(Integer.valueOf(3), lists.get(0).get(0));

        root.left = new TreeNode(9);
        root.right = new TreeNode(4);
        lists = treeLevel.zigzagLevelOrder(root);

        Assert.assertEquals(2, lists.size());
        Assert.assertEquals(1, lists.get(0).size());
        Assert.assertEquals(Integer.valueOf(3), lists.get(0).get(0));
        Assert.assertEquals(2, lists.get(1).size());
        Assert.assertEquals(Integer.valueOf(4), lists.get(1).get(0));
        Assert.assertEquals(Integer.valueOf(9), lists.get(1).get(1));

        List<List<Integer>> empty = treeLevel.levelOrder(null);
        assertNotNull(empty);
        assertEquals(0, empty.size());
    }
}