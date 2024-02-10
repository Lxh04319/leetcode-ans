public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode fast=head,slow=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow){
                //circle
                return true;
            }
        }
        return false;
    }
}
