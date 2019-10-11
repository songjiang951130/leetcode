package com.github.songjiang951130.leetcode.dfs;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class Leetcode559Test {
    Leetcode559 leet = new Leetcode559();

    @Test
    public void maxDepth() {
        Node root4 = new Node();
        root4.val = 4;
        Node root2 = new Node();
        root2.val = 2;

        Node root5 = new Node();
        root5.val = 5;
        Node root6 = new Node();
        root6.val = 6;
        List<Node> list = new ArrayList<>();
        list.add(root5);
        list.add(root6);
        Node root3 = new Node(3, list);

        List<Node> list2 = new ArrayList<>();
        list2.add(root3);
        list2.add(root4);
        list2.add(root2);

        Node root = new Node(1, list2);
        assertEquals(3, leet.maxDepth(root));
        assertEquals(0, leet.maxDepth(null));
    }
}