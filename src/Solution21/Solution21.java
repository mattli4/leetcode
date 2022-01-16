package Solution21;

import ds.ListNode;
public class Solution21 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode h = new ListNode(0);
        ListNode p = h;
        ListNode l = l1;
        ListNode m = l2;
        while(l != null && m != null){
            if(l.val < m.val){
                p.next = l;
                l = l.next;
            }else {
                p.next = m;
                m = m.next;
            }
            p = p.next;
        }
        if(l != null){
            p.next = l;
        }
        if(m != null){
            p.next = m;
        }
        return h.next;
    }

    public static void main(String[] args) {
        ListNode [] l1 = new ListNode[3];
        ListNode [] l2 = new ListNode[3];
        for (int i = 0; i < 3; i++) {
            l1[i] = new ListNode((i+1)*2);
            l2[i] = new ListNode((i+1)*3);
        }
        for (int i = 0; i < 2; i++) {
            l1[i].next = l1[i+1];
            l2[i].next = l2[i+1];
        }
        new Solution21().mergeTwoLists(l1[0], l2[0]);
    }
}
