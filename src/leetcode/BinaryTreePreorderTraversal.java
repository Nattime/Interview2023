package leetcode;

import resources.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 144. Binary Tree Preorder Traversal
 */
public class BinaryTreePreorderTraversal{
    public List<Integer> preorderTraversal(TreeNode root){
        List<Integer> ret = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode curr = root;
        while(curr != null || !stack.empty()){
            if(curr != null){
                ret.add(curr.val);
                stack.add(curr);
                curr = curr.left;
            }else{
                curr = stack.pop();
                curr = curr.right;
            }
        }
        return ret;
    }
}
