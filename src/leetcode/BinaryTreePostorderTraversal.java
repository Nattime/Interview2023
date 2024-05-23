package leetcode;

import com.resources.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 145. Binary Tree Postorder Traversal
 */
public class BinaryTreePostorderTraversal{
    public List<Integer> postorderTraversal(TreeNode root){
        List<Integer> ret = new ArrayList<>();
        if(root != null){
            Stack<TreeNode> stack = new Stack<>();
            stack.push(root);
            TreeNode prev = null;
            while(!stack.empty()){
                TreeNode curr = stack.peek();
                if(prev == null || prev.left == curr || prev.right == curr){
                    if(curr.left != null){
                        stack.push(curr.left);
                    }else if(curr.right != null){
                        stack.push(curr.right);
                    }else{
                        stack.pop();
                        ret.add(curr.val);
                    }
                }else if(curr.left == prev){
                    if(curr.right != null){
                        stack.push(curr.right);
                    }else{
                        stack.pop();
                        ret.add(curr.val);
                    }
                }else if(curr.right == prev){
                    stack.pop();
                    ret.add(curr.val);
                }
                prev = curr;
            }
        }
        return ret;
    }
}
