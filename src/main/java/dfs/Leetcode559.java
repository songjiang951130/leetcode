package dfs;

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
        if (root.children.size() == 0) {
            return 1;
        }
        int max = 0;
        for (int index = 0; index < root.children.size(); index++) {
            int temp = getDepth(root.children.get(index), depth + 1);
            max = temp > max ? temp : max;
        }
        return max;
    }

    public static void main(String[] args) {
        Node root = new Node();
        root.val = 1;

        Node root4 = new Node();
        root4.val = 4;
        Node root2 = new Node();
        root2.val = 2;

        Node root5 = new Node();
        root5.val = 5;
        Node root6 = new Node();
        root6.val = 6;
        List<Node> list = new ArrayList<Node>();
        list.add(root5);
        list.add(root6);
        Node root3 = new Node(3, list);
        root.val = 1;

    }
}

class Node {
    public int val;
    public List<Node> children;

    public Node() {
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};