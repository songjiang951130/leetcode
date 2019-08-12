package com.github.songjiang951130.leetcode.water;

import com.github.songjiang951130.leetcode.database.TreeNode;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class TreeTest {

    @Test
    public void rangeSumBST() throws IOException {
        String case1 = "[10,5,15,3,7,13,18,1,null,6]";
        TreeNode root = init(case1);
        int l = 6;
        int r = 10;
        Tree tree = new Tree();
        assertEquals(23, tree.rangeSumBST(root, l, r));
    }

    private TreeNode init(String line) {
        TreeNode root = Main.stringToTreeNode(line);
        return root;

    }
}