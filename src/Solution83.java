import ds.ListNode;
public class Solution83 {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null) return null;
        if(head.next == null) return head;
        ListNode pre = head;
        ListNode cur = head.next;
        while (cur != null){
            if(pre.val == cur.val){
                pre.next = cur.next;
                cur = cur.next;
            }else{
                pre = cur;
                cur = cur.next;
            }
        }
        return head;
    }
}
