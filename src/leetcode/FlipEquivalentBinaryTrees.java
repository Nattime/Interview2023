package leetcode;

import com.resources.TreeNode;

/**
 * 951. Flip Equivalent Binary Trees
 */

/*
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
public class FlipEquivalentBinaryTrees{
    public boolean flipEquiv(TreeNode root1, TreeNode root2){
        if(root1 == null){
            return root2 == null;
        }else if(root2 == null){
            return false;
        }else if(root1.val != root2.val){
            return false;
        }
        return (flipEquiv(root1.left, root2.left) && flipEquiv(root1.right, root2.right)) ||
                (flipEquiv(root1.left, root2.right) && flipEquiv(root1.right, root2.left));
    }
}
