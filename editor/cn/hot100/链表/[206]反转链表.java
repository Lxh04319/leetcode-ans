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
    public ListNode reverseList(ListNode head) {
        if(head==null||head.next==null) return head;
        ListNode pre=null,p=head,temp=head.next;
        while(p!=null){
            p.next=pre;
            pre=p;
            p=temp;
            if(temp!=null) temp=temp.next;
        }
        return pre;
    }
}