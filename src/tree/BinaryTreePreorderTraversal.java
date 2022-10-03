package tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreePreorderTraversal {
    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> outputIntegers = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();

        stack.push (root);
        if (root == null) return outputIntegers;
        while (stack.size() > 0) {
            TreeNode current = stack.pop();
            outputIntegers.add(current.val);
            if (current.right != null) {
                stack.push(current.right);
            }
            if (current.left != null) {
                stack.push(current.left);
            }


        }
        return outputIntegers;

    }
}
