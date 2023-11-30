package com.github.songjiang951130;

import com.github.songjiang951130.leetcode.base.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class TreeBuildTest {
    TreeBuild treeBuild = new TreeBuild();

    @Test
    public void build() {
        int[] preorder = new int[]{1, 2, 4, 5, 3};
        int[] inorder = new int[]{4, 2, 5, 1, 3};
        TreeNode node = treeBuild.build(preorder, inorder);
        Assert.assertNotNull(node);
    }
}