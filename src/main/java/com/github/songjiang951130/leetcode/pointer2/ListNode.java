package com.github.songjiang951130.leetcode.pointer2;

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int x) {
        val = x;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof ListNode) {
            ListNode node = (ListNode) obj;
            return this.val == node.val;
        }
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return "ListNode{" +
                "val=" + val +
                '}';
    }
}