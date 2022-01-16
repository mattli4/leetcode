import ds.ListNode;
public class Solution61 {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null) return null;
        ListNode p = head;
        int l = 1;
        while (p.next != null){
            l++;
            p = p.next;
        }
        p.next = head;
        ListNode node;
        int m = k % l;      //note.
        int n = l - m;
        for (int i = 0; i < n; i++) {
            p = p.next;
        }
        node = p.next;
        p.next = null;
        return node;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);
        ListNode l5 = new ListNode(5);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        ListNode l = new Solution61().rotateRight(l1, 7);
    }
}
