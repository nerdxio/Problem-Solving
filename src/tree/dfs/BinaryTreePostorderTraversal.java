package tree.dfs;

import tree.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreePostorderTraversal {
    public List<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> outputIntegers = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();

        stack.push(root);
        if (root == null) return outputIntegers;
        while (stack.size() > 0) {
            TreeNode current = stack.pop();
            outputIntegers.add(0, current.val);
            if (current.left != null) {
                stack.push(current.left);
            }
            if (current.right != null) {
                stack.push(current.right);
            }


        }
        return outputIntegers;
    }
}