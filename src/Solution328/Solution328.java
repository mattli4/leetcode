package Solution328;

import ds.ListNode;

public class Solution328 {
    public ListNode oddEvenList(ListNode head) {
        if(head == null) return null;
        if(head.next == null) return head;
        ListNode poddpre = head;
        ListNode poddcur = head.next;
        ListNode evenh = new ListNode(0);
        ListNode peven = evenh;
        int i = 1;
        while (poddcur != null){
            if(i % 2 == 1){
                ListNode tmp = new ListNode(poddcur.val);
                peven.next = tmp;
                peven = peven.next;
                poddpre.next = poddcur.next;
                poddcur = poddcur.next;
            }else {
                poddcur = poddcur.next;
                poddpre = poddpre.next;
            }
            i++;
        }
        poddpre.next = evenh.next;
        return head;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);
        ListNode l5 = new ListNode(5);
        ListNode l6 = new ListNode(6);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        l5.next = l6;
        ListNode l = new Solution328().oddEvenList(l1);
    }
}
