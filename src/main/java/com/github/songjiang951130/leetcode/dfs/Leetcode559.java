package com.github.songjiang951130.leetcode.dfs;

import java.util.ArrayList;
import java.util.List;

public class Leetcode559 {
    /**
     * @link https://leetcode.com/problems/maximum-depth-of-n-ary-tree/
     * @param root
     * @return
     */
    public int maxDepth(Node root) {
        return getDepth(root, 0);
    }

    public int getDepth(Node root, int depth) {
        if (root == null) {
            return 0;
        }
        depth = depth + 1;
        if (root.children == null || root.children.size() == 0) {
            return depth;
        }

        int max = depth;
        for (int index = 0; index < root.children.size(); index++) {
            int temp = getDepth(root.children.get(index), depth);
            max = temp > max ? temp : max;
        }
        return max;
    }


}