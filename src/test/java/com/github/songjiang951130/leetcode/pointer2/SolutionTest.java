package com.github.songjiang951130.leetcode.pointer2;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    Solution solution = new Solution();

    @Test
    public void removeNthFromEnd() {
        ListNode node4 = new ListNode(4);
        node4.next = new ListNode(5);
        ListNode node3 = new ListNode(3);
        node3.next = node4;

        ListNode node2 = new ListNode(2);
        node2.next = node3;
        ListNode head = new ListNode(1);
        head.next = node2;

        int[] result = {1, 2, 3, 5};
        solution.removeNthFromEnd(head, 2);
        int i = 0;
        while (head != null) {
            assertEquals(result[i], head.val);
            head = head.next;
            i++;
        }
    }

    @Test
    public void case2() {
        ListNode node2 = new ListNode(2);
        ListNode head = new ListNode(1);
        head.next = node2;

        int[] result = {2};
        ListNode newHead = solution.removeNthFromEnd(head, 2);
        int i = 0;
        while (newHead != null) {
            assertEquals(result[i], newHead.val);
            newHead = newHead.next;
            i++;
        }
    }

    @Test
    public void case3() {
        ListNode head = new ListNode(1);
        ListNode newHead = solution.removeNthFromEnd(head, 1);
        assertNull(newHead);
    }


}