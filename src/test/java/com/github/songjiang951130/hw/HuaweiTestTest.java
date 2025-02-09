package com.github.songjiang951130.hw;

import com.github.songjiang951130.TreeBuild;
import com.github.songjiang951130.leetcode.base.TreeNode;
import junit.framework.TestCase;

import java.util.Arrays;

public class HuaweiTestTest extends TestCase {
    HuaweiTest huaweiTestTest =  new HuaweiTest();

    public void testThreeOrders() {
        TreeNode treeNode = TreeBuild.constructTreeFromArray(new int[]{1, 2, 3});
        int[][] ints = huaweiTestTest.threeOrders(treeNode);
        System.out.println(Arrays.toString(ints[0]));
        System.out.println(Arrays.toString(ints[1]));
        System.out.println(Arrays.toString(ints[2]));
    }
}