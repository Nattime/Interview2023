package leetcode;

import resources.TreeNode;

/**
 * 98. Validate Binary Search Tree
 */
public class ValidateBinarySearchTree{
    public boolean isValidBST(TreeNode root){
        TreeNode curr = root;
        TreeNode prev = null;

        while(curr != null){
            if(curr.left == null){
                if(prev != null && prev.val >= curr.val){
                    return false;
                }
                prev = curr;
                curr = curr.right;
            }else{
                TreeNode pred = curr.left;
                while(pred.right != null && pred.right != curr){
                    pred = pred.right;
                }
                if(pred.right == null){
                    pred.right = curr;
                    curr = curr.left;
                }else{
                    pred.right = null;
                    if(prev != null && prev.val >= curr.val){
                        return false;
                    }
                    prev = curr;
                    curr = curr.right;
                }
            }
        }
        return true;
    }
}
