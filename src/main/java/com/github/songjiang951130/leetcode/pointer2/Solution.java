package com.github.songjiang951130.leetcode.pointer2;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) { val = x; }
 * }
 * 双指针解决 删除倒数第n个节点
 * @link https://leetcode-cn.com/problems/remove-nth-node-from-end-of-list
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;
        ListNode noden = head;
        for (int i = 0; i < n; i++) {
            noden = noden.next;
        }
        if (noden == null) {
            return head.next;
        }

        while (noden.next != null) {
            noden = noden.next;
            temp = temp.next;
        }
        temp.next = temp.next.next;
        return head;
    }

}