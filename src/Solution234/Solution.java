package Solution234;


public class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head == null) return true;
        if(head.next == null) return true;
        ListNode p = head;
        ListNode e = new ListNode(p.val);
        while (p.next != null){
            ListNode tmp = new ListNode(p.next.val);
            tmp.next = e;
            e = tmp;
            p = p.next;
        }
        while (head != null && e != null){
            if(head.val == e.val){
                head = head.next;
                e = e.next;
            }else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(0);
        ListNode l2 = new ListNode(0);
        ListNode l3 = new ListNode(1);
        l1.next = l2;
        l2.next = l3;
        boolean f = new Solution().isPalindrome(l1);
        System.out.println(f);
    }
}
