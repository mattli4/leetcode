package Solution445;

public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1 == null || l2 == null) return null;
        ListNode l1r = reverse(l1);
        ListNode l2r = reverse(l2);
        int carry = 0;
        int sum = l1r.val + l2r.val;
        if(sum >= 10) carry = 1;
        ListNode lh = new ListNode(sum % 10);
        ListNode pn = lh;
        while(l1r.next != null && l2r.next != null){
            sum = l1r.next.val + l2r.next.val + carry;
            if(sum >= 10) carry = 1;
            else carry = 0;
            ListNode tmp = new ListNode(sum % 10);
            pn.next = tmp;
            pn = tmp;
            l1r = l1r.next;
            l2r = l2r.next;
        }
        while (l1r.next != null) {
            sum = l1r.next.val + carry;
            ListNode tmp = new ListNode(sum % 10);
            if(sum >= 10) carry = 1;
            else carry = 0;
            pn.next = tmp;
            pn = tmp;
            l1r = l1r.next;
        }
        while (l2r.next != null) {
            sum = l2r.next.val + carry;
            ListNode tmp = new ListNode(sum % 10);
            if(sum >= 10) carry = 1;
            else carry = 0;
            pn.next = tmp;
            pn = tmp;
            l2r = l2r.next;
        }
        if(carry == 1){
            pn.next = new ListNode(1);;
        }
        return reverse(lh);
    }

    public ListNode reverse(ListNode l){
        ListNode p = l;
        ListNode h = new ListNode(l.val);
        while (p.next != null){
            ListNode tmp = new ListNode(p.next.val);
            tmp.next = h;
            h = tmp;
            p = p.next;
        }
        return h;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(5);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        l1.next = l2;
        l2.next = l3;
        ListNode l4 = new ListNode(5);
        ListNode l5 = new ListNode(2);
        ListNode l6 = new ListNode(3);
        l4.next = l5;
        l5.next = l6;
        ListNode l = new Solution().addTwoNumbers(l1, l4);
    }
}
