/**
 * We take advantage of the fact that linkedlists is based around pointers and in order
 * to reverse it we need to manipulate what it points to.
 * 
 * Leetcode: https://leetcode.com/problems/reverse-linked-list/#/description
 */

public class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
    }
}

public class Solution {
    public ListNode reverseList(ListNode head) {

        ListNode newHead = null;

        while(head != null) {
            ListNode tempNext = head.next;
            head.next = newHead;
            newHead = head;
            head = tempNext;
        }
        return newHead;
    }
}