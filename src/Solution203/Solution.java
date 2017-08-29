package Solution203;

public class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if(head == null) return null;
        ListNode p = new ListNode(0);
        p.next = head;
        ListNode l = p;
        while (p.next != null){
            if(p.next.val == val){
                if(p.next.next == null){
                    p.next = null;
                    break;
                }else {
                    p.next = p.next.next;
                    continue;               //note!
                }
            }
            p = p.next;
        }
        return l.next;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(0);
        ListNode l2 = new ListNode(1);
        ListNode l3 = new ListNode(2);
        l1.next = l2;
        l2.next = l3;
        ListNode l = new Solution().removeElements(l1, 2);
    }
}
