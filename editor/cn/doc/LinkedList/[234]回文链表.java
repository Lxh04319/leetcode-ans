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
    public boolean isPalindrome(ListNode head) {
        if(head.next==null) return true;
        ListNode slow=head,fast=head;
        ListNode pre=null,temp=null;
        while(fast!=null&&fast.next!=null){
            fast=fast.next.next;
            //反转
            temp=slow.next;
            slow.next=pre;
            pre=slow;
            slow=temp;
        }
        if(fast!=null) slow=slow.next;
        while(pre!=null&&slow!=null){
            if(pre.val!=slow.val) return false;
            pre=pre.next;
            slow=slow.next;
        }
        return true;
    }
}