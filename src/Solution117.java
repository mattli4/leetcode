import java.util.LinkedList;
import java.util.Queue;

public class Solution117 {
    static class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right, Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }
    };



    public Node connect(Node root) {
        if (root == null) return null;
        Queue<Node> q = new LinkedList<>();
        Queue<Node> qq = new LinkedList<>();
        q.offer(root);
        Node h = null;
        int count = 0;
        while (!q.isEmpty()) {
            Node n = q.poll();
            if (n.left != null) {
                qq.offer(n.left);
            }
            if (n.right != null) {
                qq.offer(n.right);
            }
            if (q.size() == count) {
                h = n;
            } else {
                h.next = n;
                h = n;
            }
            if (q.isEmpty()) {
                h.next = null;
                q.addAll(qq);
                count = qq.size() - 1;
                qq.clear();
                h = null;
            }
        }
        return root;
    }

/*    public Node connect(Node root) {
        if (root == null) return null;
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()) {
            Node h = null;
            int size = q.size();
            for (int i = 1; i <= size; i++) {
                Node n = q.poll();
                if (n.left != null) {
                    q.offer(n.left);
                }
                if(n.right != null) {
                    q.offer(n.right);
                }
                if (i != 1) {
                    h.next = n;
                }
                h = n;
            }
        }
        return root;
    }*/

    public static void main(String[] args) {
        Node [] n = new Node[6];
        for (int i = 0; i < 6; i++) {
            n[i] = new Node(i);
        }
        n[0].left = n[1];
        n[0].right = n[2];
        n[1].left = n[3];
        n[1].right = n[4];
        n[2].right = n[5];

        new Solution117().connect(n[0]);
    }
}
