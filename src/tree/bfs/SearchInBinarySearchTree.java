package tree.bfs;

import tree.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class SearchInBinarySearchTree {
    public TreeNode searchBST(TreeNode root, int val) {
        Queue<TreeNode>queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            TreeNode current = queue.remove();
            if(current.val == val)
                return current;
            if(current.left != null){
                queue.add(current.left);
            }
            if(current.right != null){
                queue.add(current.right);
            }

        }
        return null;
    }
}
