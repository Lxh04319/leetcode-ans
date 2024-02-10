class Solution {
    public ListNode reverseList(ListNode head) {
        //if(head==null) return head;
        ListNode p=null,t=head,nextt=null;
        while(t!=null){
            nextt=t.next;
            t.next=p;
            p=t;
            t=nextt;
        }
        return p;
    }
}
