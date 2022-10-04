package tree.bfs;

import tree.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversal {

    public List<List<Integer>> levelOrder(TreeNode root) {
        ArrayList<List<Integer>> outputIntegers = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        if (root == null) return outputIntegers;
        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer>innerList = new ArrayList<>();
            for (int i = 0; i < size; i++) { // looping in each element in the tree level
                TreeNode current = queue.remove();
                innerList.add(current.val);

                if (current.left != null) {
                    queue.add(current.left);
                }
                if (current.right != null) {
                    queue.add(current.right);
                }
            }
            outputIntegers.add(innerList);//it is mean visited


        }
        return outputIntegers;
    }
}
