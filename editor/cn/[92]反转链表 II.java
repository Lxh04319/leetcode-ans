class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummyhead=new ListNode(0);
        dummyhead.next=head;
        ListNode l=dummyhead,r=head;
        //ListNode temp=null;
        for(int i=1;i<left;i++){
            l=l.next;
            r=r.next;
        }
        for(int i=1;i<=right-left;i++){
            ListNode temp=r.next;
            r.next=r.next.next;
            //l=r;
            temp.next=l.next;
            l.next=temp;
            //r=temp;
        }
        return dummyhead.next;
    }
}
