/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode dummy=new ListNode(0,head);
        ListNode pre=dummy,cur,temp;
        while(pre.next!=null&&pre.next.next!=null){
            cur=pre.next;
            temp=cur.next;
            pre.next=temp;
            cur.next=temp.next;
            temp.next=cur;
            pre=cur;
        }
        return dummy.next;
    }
}