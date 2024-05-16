package leetcode;

import resources.TreeNode;

/**
 * 2331. Evaluate Boolean Binary Tree
 * <p>
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
public class EvaluateBooleanBinaryTree{
    public boolean evaluateTree(TreeNode root){
        if(root.right == null && root.left == null){
            return root.val == 1;
        }
        if(root.val == 2){
            return evaluateTree(root.left) || evaluateTree(root.right);
        }else if(root.val == 3){
            return evaluateTree(root.left) && evaluateTree(root.right);
        }else{
            return root.val == 1;
        }
    }
}
