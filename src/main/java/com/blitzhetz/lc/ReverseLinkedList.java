package com.blitzhetz.lc;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

// temp -> next -> next = prev -> prev = curr -> curr = temp
// case 1: [1, 2, 3, 4, 5]

// init
// temp = 1 -> value of first node
// next = 2 -> value of second node

// swap part
// temp = next -> 2
// next = prev -> init null -> 1
// prev = curr -> 1
// curr = temp -> 2
public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null)
            return head;

        ListNode prev = head;
        ListNode curr = head.next;

        while (curr != null) {
            ListNode temp = null;
            temp = curr.next;

            // reverse part
            curr.next = prev;

            // add one to right position
            prev = curr;
            curr = temp;
        }

        // tail
        head.next = null;

        return prev;

    }
}
