import ds.ListNode;
/*
* if(head==null) return false;
    ListNode walker = head;
    ListNode runner = head;
    while(runner.next!=null && runner.next.next!=null) {
        walker = walker.next;
        runner = runner.next.next;
        if(walker==runner) return true;
    }
    return false;
* */

public class Solution141 {
    public boolean hasCycle(ListNode head) {
        if(head == null) return false;
        ListNode cur = head;
        ListNode nxt = head;
        while (nxt.next != null && nxt.next.next != null){
            cur = cur.next;
            nxt = nxt.next.next;
            if(cur == nxt) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(0);
        ListNode l2 = new ListNode(1);
        ListNode l3 = new ListNode(2);
        l1.next = l2;
        l2.next = l3;
        l3.next = l2;
        boolean l = new Solution141().hasCycle(l1);
        System.out.println(l);
    }
}
