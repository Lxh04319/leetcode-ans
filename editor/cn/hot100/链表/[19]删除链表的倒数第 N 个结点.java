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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode p=head,dummy=new ListNode(0,head);
        int len=0;
        while(p!=null){
            p=p.next;
            len++;
        }
        p=dummy;
        for(int i=0;i<len-n;i++){
            p=p.next;
        }
        p.next=p.next.next;
        //head可能被删除
        return dummy.next;
    }
}