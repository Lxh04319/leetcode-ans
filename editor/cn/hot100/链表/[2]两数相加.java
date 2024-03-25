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
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode();
        ListNode temp = head;
        int a, b, pre = 0, value;
        while (l1 != null || l2 != null) {
            a = l1== null ? 0 : l1.val;
            b = l2 == null ? 0 : l2.val;
            value = (a + b + pre) % 10;
            pre = (a + b + pre) / 10;
            temp.next = new ListNode(value);
            temp = temp.next;
            if (l1 != null)
                l1 = l1.next;
            if (l2 != null)
                l2 = l2.next;
        }
        if (pre >= 1) {
            temp.next = new ListNode(pre);
        }
        return head.next;
    }
}