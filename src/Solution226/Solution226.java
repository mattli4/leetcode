package Solution226;

import ds.TreeNode;

public class Solution226 {
    public TreeNode invertTree(TreeNode root) {
        TreeNode node = new TreeNode(0);
        node = root;
        if(node == null) return null;
        if(node.left == null && node.right == null){
            return node;
        }
        if(node.left == null){
            node.left = node.right;
            node.right = null;
            invertTree(node.left);
            return root;
        }
        if(node.right == null){
            node.right = node.left;
            node.left = null;
            invertTree(node.right);
            return root;
        }
        TreeNode t = new TreeNode(0);
        t = node.right;
        node.right = node.left;
        node.left = t;
        invertTree(node.left);
        invertTree(node.right);
        return root;
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
        TreeNode n = new Solution226().invertTree(n1);
    }
}
