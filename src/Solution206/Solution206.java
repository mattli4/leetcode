package Solution206;

import ds.ListNode;

public class Solution206 {
    public ListNode reverseList(ListNode head) {
        if(head == null) return null;
        ListNode p = head;
        ListNode tail = new ListNode(p.val);
        while (p.next != null){
            ListNode tmp = new ListNode(p.next.val);
            tmp.next = tail;
            tail = tmp;
            p = p.next;
        }
        return tail;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(0);
        ListNode l2 = new ListNode(1);
        ListNode l3 = new ListNode(2);
        l1.next = l2;
        l2.next = l3;
        ListNode l = new Solution206().reverseList(l1);
    }
}
