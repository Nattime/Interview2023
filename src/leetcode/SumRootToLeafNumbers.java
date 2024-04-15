package leetcode;

import resources.TreeNode;

/**
 * 129. Sum Root to Leaf Numbers
 * <p>
 * * Definition for a binary tree node.
 * * public class TreeNode {
 * *     int val;
 * *     TreeNode left;
 * *     TreeNode right;
 * *     TreeNode() {}
 * *     TreeNode(int val) { this.val = val; }
 * *     TreeNode(int val, TreeNode left, TreeNode right) {
 * *         this.val = val;
 * *         this.left = left;
 * *         this.right = right;
 * *     }
 * * }
 */
public class SumRootToLeafNumbers{
    public int sumNumbers(TreeNode root){
        return helper(root, 0);
    }

    public int helper(TreeNode node, int num){
        if(node == null){
            return 0;
        }
        int n = num * 10 + node.val;
        if(node.left == null && node.right == null){
            return n;
        }
        return helper(node.left, n) + helper(node.right, n);
    }
}
