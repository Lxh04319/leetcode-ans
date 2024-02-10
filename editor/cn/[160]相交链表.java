public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode a=headA,b=headB;
        int lena=0,lenb=0;
        while(a!=null){
            lena++;
            a=a.next;
        }
        while(b!=null){
            lenb++;
            b=b.next;
        }
        int dif=Math.abs(lena-lenb);
        a=headA;
        b=headB;
        if(lena>lenb){
            for(int i=0;i<dif;i++) a=a.next;
        }
        else for(int i=0;i<dif;i++) b=b.next;
        while(a!=null&&b!=null){
            if(a==b) return a;
            a=a.next;
            b=b.next;
        }
        return null;
    }
}

public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode a=headA,b=headB;
        //strange method
        while(a!=b){
            if(a==null) a=headB;
            else a=a.next;
            if(b==null) b=headA;
            else b=b.next;
        }
        return a;
    }
}

