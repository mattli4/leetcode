package Solution19;

import java.util.ArrayList;
import ds.ListNode;

public class Solution19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) return null;
        ArrayList<ListNode> list = new ArrayList<>();
        int len = 0;
        ListNode p = head;
        while (p != null){
            len++;
            list.add(p);
            p = p.next;
        }
        int idx = len - n;
        if(idx < 0) return null;
        if(idx == 0) return head.next;
        list.get(idx - 1).next = list.get(idx).next;
        return head;
    }
}
