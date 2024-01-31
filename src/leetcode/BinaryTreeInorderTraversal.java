package leetcode;

import resources.TreeNode;

import java.util.LinkedList;
import java.util.List;

/**
 * 94. Binary Tree Inorder Traversal
 */
public class BinaryTreeInorderTraversal{
    public List<Integer> inorderTraversal(TreeNode root){
        List<Integer> ret = new LinkedList<>();
        helper(root, ret);
        return ret;
    }

    void helper(TreeNode root, List<Integer> list){
        if(root != null){
            helper(root.left, list);
            list.add(root.val);
            helper(root.right, list);
        }
    }
}
