package com.github.songjiang951130.leetcode.week1;

import com.github.songjiang951130.leetcode.base.TreeNode;

import java.util.*;

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
     *
     * @param root
     * @return
     * @todo 方便的树构建方式
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
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
                if (i == size - 1) {
                    res.addFirst(temp);
                }
            }
        }
        return res;
    }

    public String modifyString(String s) {
        if (s.length() == 1) {
            if (s.charAt(0) == '?') {
                return "a";
            }
            return s;
        }
        char[] array = s.toCharArray();
        for (int j = 0; j < array.length; j++) {
            char c = array[j];
            if (c == '?') {
                if (j == 0) {
                    for (char i = 'a'; i <= 'z'; i++) {
                        if (i != array[j + 1]) {
                            array[j] = i;
                        }
                    }
                } else if (j == array.length - 1) {
                    for (char i = 'a'; i <= 'z'; i++) {
                        if (i != array[j - 1]) {
                            array[j] = i;
                        }
                    }
                } else {
                    for (char i = 'a'; i <= 'z'; i++) {
                        if (i != array[j - 1] && i != array[j + 1]) {
                            array[j] = i;
                        }
                    }
                }

            }
        }
        return new String(array);
    }


    /**
     * 需要考虑超出范围,对结果进行缓存
     *
     * @param nums1
     * @param nums2
     * @return
     */
    public int numTriplets(int[] nums1, int[] nums2) {
        return helper(nums1, nums2) + helper(nums2, nums1);
    }

    private int helper(int[] nums1, int[] nums2) {
        /**
         * 缓存结果和次数避免超时
         */
        Map<Long, Integer> cacheSum = new HashMap<>();
        int res = 0;
        for (int j = 0; j < nums2.length; j++) {
            for (int k = j + 1; k < nums2.length; k++) {
                long sum = (long) nums2[j] * nums2[k];
                cacheSum.put(sum, cacheSum.getOrDefault(sum, 0) + 1);
            }
        }
        for (int i = 0; i < nums1.length; i++) {
            long sum = (long) nums1[i] * nums1[i];
            if (cacheSum.containsKey(sum)) {
                res += cacheSum.get(sum);
            }
        }
        return res;
    }
}