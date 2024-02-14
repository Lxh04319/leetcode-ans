class Solution {
    public ListNode removeElements(ListNode head, int val) {
        //if(head==null) return head;
        while(head!=null&&head.val==val){
            head=head.next;
        }
        if(head==null) return head;
        ListNode p=head;
        ListNode t=head.next;
        while(t!=null){
            if(t.val==val){
                p.next=t.next;
            }
            else {
                p=p.next;
            }
            t=t.next;
        }
        return head;
    }
}
