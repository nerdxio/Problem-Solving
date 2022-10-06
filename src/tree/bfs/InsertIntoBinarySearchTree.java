package tree.bfs;

import tree.TreeNode;

public class InsertIntoBinarySearchTree {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null) return new TreeNode(val);

        TreeNode current = root;
        while (true) {
            if (current.val <= val) {
                if (current.right != null) { // every right element is larger than prev
                    current = current.right;
                } else {
                    current.right = new TreeNode(val);
                    break;
                }
            } else {
                if (current.left != null) { // every left element is smaller than prev
                        current = current.left;
                } else {
                    current.left = new TreeNode(val);
                    break;
                }
            }
        }
        return root;
    }
}

