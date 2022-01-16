package Solution199;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import ds.TreeNode;

public class Solution199 {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list = new LinkedList<Integer>();
        if(root == null) return list;
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        Queue<TreeNode> tmp = new LinkedList<TreeNode>();
        queue.offer(root);
        while (!queue.isEmpty()){
            TreeNode node = queue.poll();
            if(node.left != null){
                tmp.offer(node.left);
            }
            if(node.right != null){
                tmp.offer(node.right);
            }
            if(queue.isEmpty()){
                list.add(node.val);
                while (!tmp.isEmpty()){
                    queue.offer(tmp.poll());
                }
            }
        }
        return list;
    }

    public static void main(String[] args) {
        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);
        TreeNode n4 = new TreeNode(4);
        TreeNode n5 = new TreeNode(5);
        n1.left = n2;
        n5.right = n3;
        n2.left = n4;
        n2.right = n5;
        List<Integer> list = new Solution199().rightSideView(n1);
        System.out.println(list);
    }
}
