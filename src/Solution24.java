import ds.ListNode;
public class Solution24 {
    public ListNode swapPairs(ListNode head) {
        if(head == null) return null;
        if(head.next == null) return head;
        ListNode fakehead = new ListNode(0);
        fakehead.next = head;
        ListNode cur = fakehead;
        while (cur.next != null && cur.next.next != null){
            ListNode f = cur.next;
            ListNode s = cur.next.next;
            cur.next = s;
            f.next = s.next;
            s.next = f;
            cur = cur.next.next;
        }
        return fakehead.next;
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
        ListNode l = new Solution24().swapPairs(l1);
    }
}
