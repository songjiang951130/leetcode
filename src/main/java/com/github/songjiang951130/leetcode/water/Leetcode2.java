package com.github.songjiang951130.leetcode.water;
//给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
//
// 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。 
//
// 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。 
//
// 示例： 
//
// 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
//输出：7 -> 0 -> 8
//原因：342 + 465 = 807
// 
// Related Topics 链表 数学 
// 👍 4842 👎 0


//leetcode submit region begin(Prohibit modification and deletion)

import com.github.songjiang951130.leetcode.pointer2.ListNode;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) { val = x; }
 * }
 */
class Leetcode2 {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode fake = new ListNode(0);
        ListNode temp = fake;
        int left = 0;
        while (l1 != null || l2 != null) {
            int val = left;
            if (l1 == null) {
                val += l2.val;
            } else if (l2 == null) {
                val += l1.val;
            } else {
                val += l1.val + l2.val;
            }
            ListNode node = new ListNode(val % 10);
            left = val / 10;
            l1 = l1 == null ? null : l1.next;
            l2 = l2 == null ? null : l2.next;
            temp.next = node;
            temp = temp.next;
        }
        if (left > 0) {
            temp.next = new ListNode(left);
        }
        return fake.next;
    }
}
