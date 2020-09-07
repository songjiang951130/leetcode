package com.github.songjiang951130.leetcode.water;

import com.github.songjiang951130.leetcode.pointer2.ListNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class Leetcode2Test {
    Leetcode2 leetcode = new Leetcode2();

    @Test
    public void addTwoNumbers() {
        ListNode result = leetcode.addTwoNumbers(getNodeList("2,4,3"), getNodeList("5,6,4"));
        ListNode expect = getNodeList("7,0,8");
        while (expect != null) {
            assertEquals(expect,result);
            result = result.next;
            expect = expect.next;
        }
    }

    @Test
    public void addTwoNumbersCase2() {
        ListNode result = leetcode.addTwoNumbers(getNodeList("5"), getNodeList("5"));
        ListNode expect = getNodeList("0,1");
        while (expect != null) {
            assertEquals(expect,result);
            result = result.next;
            expect = expect.next;
        }
    }

    @Test
    public void addTwoNumbersCase3() {
        ListNode result = leetcode.addTwoNumbers(getNodeList("1"), getNodeList("9,9"));
        ListNode expect = getNodeList("0,0,1");
        while (expect != null) {
            assertEquals(expect,result);
            result = result.next;
            expect = expect.next;
        }
    }

    public static ListNode getNodeList(String str) {
        ListNode fake = new ListNode(0);
        ListNode t = fake;
        String[] nodes = str.split(",");
        for (String s : nodes) {
            int val = Integer.parseInt(s);
            ListNode node = new ListNode(val);
            t.next = node;
            t = t.next;
        }
        return fake.next;
    }
}