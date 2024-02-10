public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode fast=head,slow=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                //have circle
                ListNode p=head;
                while(fast!=p){
                    fast=fast.next;
                    p=p.next;
                }
                return p;
            }
        }
        return null;
    }
}
