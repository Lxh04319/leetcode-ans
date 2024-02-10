class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode dummy=new ListNode(-1);
        dummy.next=head;
        ListNode pre=dummy;
        ListNode first,second;
        while(pre.next!=null&&pre.next.next!=null){
            first=pre.next;
            second=first.next;
            pre.next=second;
            first.next=second.next;
            second.next=first;
            pre=first;
        }
        return dummy.next;
    }
}
