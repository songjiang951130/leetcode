package com.github.songjiang951130.leetcode.dfs;


import com.github.songjiang951130.leetcode.database.TreeNode;
import org.junit.Assert;
import org.junit.Test;
import com.github.songjiang951130.leetcode.water.Main;

import java.util.ArrayList;
import java.util.List;

public class Leetcode257Test {
    Leetcode257 leetcode;

    public Leetcode257Test() {
        this.leetcode = new Leetcode257();
    }

    @Test
    public void testPath() {
        TreeNode root = Main.stringToTreeNode("[1,2,3,null,5]");
        List<String> list = leetcode.binaryTreePaths(root);
        List<String> result = new ArrayList<String>();
        result.add("1->2->5");
        result.add("1->3");
        for (int i = 0;i<list.size();i++){
            Assert.assertEquals(result.get(i),list.get(i));
        }
    }
}
