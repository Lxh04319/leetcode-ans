/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        //纯证明长度相等
        if(head==null||head.next==null) return null;
        ListNode slow=head,fast=head;
        while(true){
            if(fast==null||fast.next==null) return null;
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast) break;
        }
        slow=head;
        while(slow!=fast){
            fast=fast.next;
            slow=slow.next;

        }
        return fast;
    }
}